package com.assignment.moniepointtest.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.assignment.moniepointtest.presentation.home.HomeScreen
import com.assignment.moniepointtest.presentation.profile.ProfileScreen
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
                        // Bottom navigation
                        bottomBar = {
                            Card(colors = CardDefaults.cardColors(containerColor = Color.White),
                                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                                shape = RoundedCornerShape(0.dp)
                            ) {
                                    NavigationBar(
                                        modifier = Modifier.padding(0.dp).height(130.dp),
                                        tonalElevation = 10.dp,
                                        // set background color
                                        containerColor = Color.White
                                    ) {
                                        TabNavigationItem(
                                            "home",
                                            navController,
                                            iconRes = R.drawable.home,
                                            imageSize = 22,
                                            title = "Home"
                                        )
                                        TabNavigationItem(
                                            "calculate",
                                            navController,
                                            iconRes = R.drawable.keys,
                                            imageSize = 22,
                                            title = "Calculate"
                                        )
                                        TabNavigationItem(
                                            "shipment",
                                            navController,
                                            iconRes = R.drawable.time,
                                            imageSize = 22,
                                            title = "Shipment"
                                        )
                                        TabNavigationItem(
                                            "profile",
                                            navController,
                                            iconRes = R.drawable.user,
                                            imageSize = 22,
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

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {

    NavHost(
        navController = navController,

        // set the start destination as home
        startDestination = "home",

        // Set the padding provided by scaffold
        modifier = Modifier.padding(paddingValues = padding),

        builder = {

            // route : Home
            composable("home") {
                HomeScreen()
            }

            // route : calculate
            composable("calculate") {
                CalculateScreen()
            }

            // route : shipment
            composable("shipment") {
                ShipmentScreen()
            }

            // route : profile
            composable("profile") {
                ProfileScreen()
            }
        })
}

@Composable
private fun RowScope.TabNavigationItem(route: String, navController: NavHostController, iconRes: Int, imageSize: Int = 30, title: String = "Home") {
    var selectionTint by remember { mutableStateOf(PrimaryColor) }
    var handleTint by remember { mutableStateOf(PrimaryColor) }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    if (currentRoute == "home" && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor
    }
    else  if (currentRoute == "calculate" && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor
    }
    else if (currentRoute == "shipment" && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor

    }
    else if (currentRoute == "profile" && route == currentRoute) {
        selectionTint = PrimaryColor
        handleTint = PrimaryColor

    }else {
        selectionTint = DarkGray
        handleTint = Color.White
    }

    NavigationBarItem(
        modifier = Modifier.padding(bottom = 30.dp).height(50.dp),
        selected = currentRoute == route,
        // navigate on click
        onClick = {
            navController.navigate(route)
        },
        // Icon of navItem
        icon = {
            Column(verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Box(modifier = Modifier.fillMaxWidth().height(4.dp)
                    .background(color = handleTint), contentAlignment = Alignment.Center){}

                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
                    ImageComponent(
                        modifier = Modifier.size(imageSize.dp),
                        imageRes = iconRes,
                        colorFilter = ColorFilter.tint(selectionTint)
                    )
                }
            }

        },

        // label
        label = {
            TextComponent(
                text = title,
                fontSize = 14,
                textStyle = TextStyle(),
                textColor = selectionTint,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 30,
                fontFamily = monaSansFamily,
                textModifier = Modifier.padding(
                    end = 10.dp,
                    start = 10.dp
                ))
        },
        alwaysShowLabel = true,

        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Red,
            unselectedIconColor = Color.Blue,
            selectedTextColor = Color.Red,
            unselectedTextColor = Color.Blue,
            indicatorColor = Color.Transparent
        )
    )
}