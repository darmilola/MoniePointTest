package com.assignment.moniepointtest.presentation.screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.presentation.calculate.CalculateScreen
import com.assignment.moniepointtest.presentation.estimates.EstimateScreen
import com.assignment.moniepointtest.presentation.home.HomeScreen
import com.assignment.moniepointtest.presentation.profile.ProfileScreen
import com.assignment.moniepointtest.presentation.searchReceiptNumber.SearchReceiptScreen
import com.assignment.moniepointtest.presentation.shipment.ShipmentScreen
import com.assignment.moniepointtest.ui.theme.DarkGray
import com.assignment.moniepointtest.ui.theme.MoniePointTestTheme
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextComponent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoniePointTestTheme {
                val navController = rememberNavController()
                Surface(color = Color.White) {
                    // Scaffold Component
                    Scaffold(
                        topBar = {},
                        // Bottom navigation
                        bottomBar = {
                            Card(colors = CardDefaults.cardColors(containerColor = Color.White),
                                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                                shape = RoundedCornerShape(0.dp),modifier = Modifier.height(115.dp)
                            ) {
                                    NavigationBar(
                                        tonalElevation = 10.dp,
                                        // set background color
                                        modifier = Modifier.fillMaxSize(),
                                        containerColor = Color.White
                                    ) {
                                        TabNavigationItem(
                                            Screen.HomeScreen.route,
                                            navController,
                                            iconRes = R.drawable.hut,
                                            title = "Home"
                                        )
                                        TabNavigationItem(
                                            Screen.CalculateScreen.route,
                                            navController,
                                            iconRes = R.drawable.math,
                                            title = "Calculate"
                                        )
                                        TabNavigationItem(
                                            Screen.ShipmentScreen.route,
                                            navController,
                                            iconRes = R.drawable.time,
                                            title = "Shipment"
                                        )
                                        TabNavigationItem(
                                            Screen.ProfileScreen.route,
                                            navController,
                                            iconRes = R.drawable.avatar,
                                            title = "Profile"
                                        )

                                    }
                            }
                        }, content = { padding ->
                            // Nav host: where screens are placed
                            NavHostContainer(navController = navController, padding = padding)
                        }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {
    val context = LocalContext.current

    SharedTransitionLayout() {
        NavHost(
            navController = navController,

            // set the start destination as home
            startDestination = Screen.HomeScreen.route,

            // Set the padding provided by scaffold
            modifier = Modifier.padding(paddingValues = padding),

            builder = {

                // route : Home
                composable(Screen.HomeScreen.route) {
                    HomeScreen(onEnterReceiptFocused = {
                        navController.navigate(Screen.SearchReceiptScreen.route)
                    }, this@SharedTransitionLayout,this@composable)
                }

                // route : calculate
                composable(Screen.CalculateScreen.route) {
                    CalculateScreen(onNavigateToEstimate = {
                        navController.navigate(Screen.EstimateScreen.route)
                    })
                }

                // route : shipment
                composable(Screen.ShipmentScreen.route) {
                    ShipmentScreen()
                }

                // route : profile
                composable(Screen.ProfileScreen.route) {
                    ProfileScreen()
                }

                // route : estimate
                composable(Screen.EstimateScreen.route) {
                    EstimateScreen()
                }

                // route : Search Receipt Number
                composable(Screen.SearchReceiptScreen.route) {
                    SearchReceiptScreen(onBackPressed = {
                        navController.popBackStack()
                    },this@SharedTransitionLayout,this@composable)
                }
            })
    }
}

@Composable
private fun RowScope.TabNavigationItem(route: String, navController: NavHostController, iconRes: Int, title: String = "Home") {
    var selectionTint by remember { mutableStateOf(PrimaryColor) }
    var handleTint by remember { mutableStateOf(PrimaryColor) }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    if (currentRoute == Screen.HomeScreen.route && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor
    }
    else  if (currentRoute == Screen.CalculateScreen.route && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor
    }
    else if (currentRoute == Screen.ShipmentScreen.route && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor

    }
    else if (currentRoute == Screen.ProfileScreen.route && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor

    }else {
        selectionTint = DarkGray
        handleTint = Color.White
    }

    NavigationBarItem(
        modifier = Modifier
            .padding(0.dp)
            .height(80.dp),
        selected = currentRoute == route,
        // navigate on click
        onClick = {
            navController.navigate(route)
        },
        // Icon of navItem
        icon = {
            Column(verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
                    .background(color = handleTint), contentAlignment = Alignment.Center){}

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp), contentAlignment = Alignment.Center) {
                    ImageComponent(
                        modifier = Modifier.size(24.dp),
                        imageRes = iconRes,
                        colorFilter = ColorFilter.tint(selectionTint)
                    )
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp), contentAlignment = Alignment.TopCenter) {
                    TextComponent(
                        text = title,
                        fontSize = 14,
                        textStyle = TextStyle(),
                        textColor = selectionTint,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 20,
                        fontFamily = monaSansFamily,
                        textModifier = Modifier
                    )
                }
            }

        },

        // label
        label = {
        /*    TextComponent(
                text = title,
                fontSize = 14,
                textStyle = TextStyle(),
                textColor = selectionTint,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 20,
                fontFamily = monaSansFamily,
                textModifier = Modifier.background(color = Color.Red).padding(0.dp))*/

        },
        alwaysShowLabel = false,

        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Red,
            unselectedIconColor = Color.Blue,
            selectedTextColor = Color.Red,
            unselectedTextColor = Color.Blue,
            indicatorColor = Color.Transparent
        )
    )
}