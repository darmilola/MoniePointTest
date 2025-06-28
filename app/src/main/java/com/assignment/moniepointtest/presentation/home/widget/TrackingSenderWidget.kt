package com.assignment.moniepointtest.presentation.home.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.ui.theme.Green
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun SenderWidget(){

    val modifier  = Modifier
        .fillMaxWidth()
        .padding(bottom = 10.dp,start = 15.dp, end = 15.dp)
        .height(70.dp)

    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically) {

        Row(modifier = Modifier.fillMaxHeight().weight(2f), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(R.drawable.sender),
                contentDescription = "Image Component",
                modifier = Modifier.size(48.dp)
            )

            Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
                Box(
                    modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    TextComponent(
                        text = "Sender",
                        fontSize = 14,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color(0xFF8f8f8f),
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        fontFamily = monaSansFamily,
                        lineHeight = 25,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.fillMaxWidth()
                    )
                }
                Box(
                    modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    TextComponent(
                        text = "Atlanta, 5243",
                        fontSize = 16,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color.Black,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 25,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth()
                    )
                }
            }

        }
        Column(modifier = Modifier.fillMaxHeight().weight(1f),horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {


            Box(
                modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                contentAlignment = Alignment.Center
            ) {
                TextComponent(
                    text = "Time",
                    fontSize = 14,
                    textStyle = MaterialTheme.typography.titleMedium,
                    textColor = Color(0xFF8f8f8f),
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Normal,
                    fontFamily = monaSansFamily,
                    lineHeight = 25,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textModifier = Modifier.fillMaxWidth()
                )
            }
            Row(
                modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start
            ) {
                Box(modifier = Modifier.size(5.dp).background(color = Green, shape = CircleShape))

                TextComponent(
                    text = "2 day - 3 days",
                    fontSize = 14,
                    textStyle = MaterialTheme.typography.titleMedium,
                    textColor = Color.Black,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 25,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textModifier = Modifier.wrapContentWidth().padding(start = 5.dp)
                )
            }


        }

    }

}