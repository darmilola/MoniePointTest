package com.assignment.moniepointtest.presentation.home

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.presentation.home.widget.AddStopWidget
import com.assignment.moniepointtest.presentation.home.widget.AvailableVehicleWidget
import com.assignment.moniepointtest.presentation.home.widget.HomeSearchBarWidget
import com.assignment.moniepointtest.presentation.home.widget.ReceiverWidget
import com.assignment.moniepointtest.presentation.home.widget.SenderWidget
import com.assignment.moniepointtest.presentation.home.widget.ShipmentNumberWidget
import com.assignment.moniepointtest.presentation.home.widget.TopBarProfile
import com.assignment.moniepointtest.ui.theme.LessWhite
import com.assignment.moniepointtest.ui.theme.LightGray
import com.assignment.moniepointtest.ui.theme.MoniePointTestLightTheme
import com.assignment.moniepointtest.ui.theme.MoniePointTestTheme
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.TextComponent

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun HomeScreen(
    onEnterReceiptFocused: () -> Unit,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedContentScope
) {
    MoniePointTestTheme {
        val boundsTransform = { _: Rect, _: Rect -> tween<Rect>(400) }
        with(sharedTransitionScope) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(LessWhite),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Column(
                    modifier = Modifier.fillMaxWidth().height(150.dp)
                        .background(color = PrimaryColor)
                ) {

                    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                        TopBarProfile()
                    }

                    Box(
                        modifier = Modifier
                            .sharedElement(
                                rememberSharedContentState(key = "searchWidget"),
                                animatedVisibilityScope = animatedContentScope,
                                boundsTransform = boundsTransform
                            )
                            .fillMaxWidth().wrapContentHeight()
                            .padding(end = 10.dp, start = 10.dp, top = 20.dp)
                    ) {
                        HomeSearchBarWidget(onFocused = {
                            onEnterReceiptFocused()
                        })
                    }
                }

                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = LessWhite)
                        .verticalScroll(rememberScrollState())
                ) {

                    Column(modifier = Modifier.fillMaxWidth().height(360.dp)) {

                        Box(
                            modifier = Modifier.height(60.dp).fillMaxWidth()
                                .padding(start = 20.dp, top = 10.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            TextComponent(
                                text = "Tracking",
                                fontSize = 18,
                                textStyle = MaterialTheme.typography.titleMedium,
                                textColor = Color.Black,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.Medium,
                                fontFamily = monaSansFamily,
                                lineHeight = 30,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                textModifier = Modifier.fillMaxWidth()
                            )
                        }

                        Box(
                            modifier = Modifier.wrapContentHeight().fillMaxWidth()
                                .padding(start = 15.dp, top = 10.dp, end = 15.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {

                            Card(
                                colors = CardDefaults.cardColors(containerColor = Color.White),
                                elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                                shape = RoundedCornerShape(15.dp),
                                modifier = Modifier.fillMaxWidth().height(280.dp)
                            ) {

                                Column(modifier = Modifier.fillMaxWidth().height(280.dp)) {
                                    ShipmentNumberWidget()
                                    Box(
                                        modifier = Modifier.fillMaxWidth().height(1.dp)
                                            .padding(start = 15.dp, end = 15.dp)
                                    ) {
                                        Box(
                                            modifier = Modifier.fillMaxWidth().height(1.dp)
                                                .background(color = LightGray)
                                        )
                                    }
                                    SenderWidget()
                                    ReceiverWidget()
                                    Box(
                                        modifier = Modifier.fillMaxWidth().height(1.dp)
                                            .background(color = LightGray)
                                    )
                                    AddStopWidget()
                                }


                            }


                        }


                    }



                    Column(modifier = Modifier.fillMaxWidth().height(380.dp)) {

                        Box(
                            modifier = Modifier.height(60.dp).fillMaxWidth()
                                .padding(start = 20.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            TextComponent(
                                text = "Available vehicles",
                                fontSize = 18,
                                textStyle = MaterialTheme.typography.titleMedium,
                                textColor = Color.Black,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.Medium,
                                fontFamily = monaSansFamily,
                                lineHeight = 30,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                textModifier = Modifier.fillMaxWidth()
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth().wrapContentHeight().horizontalScroll(
                                rememberScrollState()
                            )
                        ) {

                            AvailableVehicleWidget(
                                freightName = "Ocean Freight",
                                tag = "International",
                                imageRes = R.drawable.ocean_feight
                            )
                            AvailableVehicleWidget(
                                freightName = "Cargo Freight",
                                tag = "Reliable",
                                imageRes = R.drawable.cargo_freight
                            )
                            AvailableVehicleWidget(
                                freightName = "Air Freight",
                                tag = "International",
                                imageRes = R.drawable.ocean_feight
                            )


                        }

                    }


                }


            }
        }
    }
}