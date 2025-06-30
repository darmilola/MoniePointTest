package com.assignment.moniepointtest.presentation.estimates

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.ui.theme.DarkGray
import com.assignment.moniepointtest.ui.theme.LessWhite
import com.assignment.moniepointtest.ui.theme.MoniePointTestLightTheme
import com.assignment.moniepointtest.ui.theme.MoniePointTestTheme
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun EstimateScreen(onBackHomeClicked:() -> Unit) {
    MoniePointTestLightTheme {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(LessWhite),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .verticalScroll(rememberScrollState())
            ) {

                Box(modifier = Modifier.fillMaxWidth().height(150.dp), contentAlignment = Alignment.Center){

                    ImageComponent(modifier = Modifier.height(50.dp).width(250.dp), imageRes = R.drawable.logo)

                }

                Box(modifier = Modifier.fillMaxWidth().height(200.dp), contentAlignment = Alignment.Center){

                    ImageComponent(modifier = Modifier.height(150.dp).width(250.dp), imageRes = R.drawable.box_logo)

                }
                Column(modifier = Modifier.fillMaxWidth().height(150.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        TextComponent(
                            text = "Total Estimated Amount",
                            fontSize = 24,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Normal,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.wrapContentWidth()
                        )
                    }
                    Row(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center
                    ) {
                        TextComponent(
                            text = "$1452",
                            fontSize = 24,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color(0XFF3ec78d),
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Normal,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.wrapContentWidth()
                        )

                        TextComponent(
                            text = "USD",
                            fontSize = 16,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color(0XFF3ec78d),
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Normal,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.wrapContentWidth().padding(top = 5.dp, start = 5.dp)
                        )
                    }
                    TextComponent(
                        text = "This amount is estimated this will vary",
                        fontSize = 14,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color(0xff8d8d8d),
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        fontFamily = monaSansFamily,
                        lineHeight = 15,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth()
                    )
                    TextComponent(
                        text = "if you change your location or weight",
                        fontSize = 14,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color(0xff8d8d8d),
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        fontFamily = monaSansFamily,
                        lineHeight = 15,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth()
                    )
                }

                Box(
                    modifier = Modifier.fillMaxWidth().height(70.dp).clickable {
                      onBackHomeClicked()
                    }.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                        .background(color = Color(0xffee8a3c), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    TextComponent(
                        text = "Back to home",
                        fontSize = 16,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color.White,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Medium,
                        fontFamily = monaSansFamily,
                        lineHeight = 30,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth()
                    )
                }
            }
        }
    }
}