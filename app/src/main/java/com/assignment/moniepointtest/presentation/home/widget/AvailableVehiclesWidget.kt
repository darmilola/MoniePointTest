package com.assignment.moniepointtest.presentation.home.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import presentations.components.TextComponent

@Composable
fun AvailableVehicleWidget(freightName: String, tag: String, imageRes: Int) {

    val modifier = Modifier
        .padding(bottom = 10.dp, start = 10.dp, end = 10.dp)
        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
        .width(140.dp)
        .height(200.dp)

    Column(modifier = modifier) {
        Column(modifier = Modifier.height(70.dp).fillMaxWidth().padding(start = 15.dp), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                contentAlignment = Alignment.Center
            ) {
                TextComponent(
                    text = freightName,
                    fontSize = 15,
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
            Box(
                modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                contentAlignment = Alignment.Center
            ) {
                TextComponent(
                    text = tag,
                    fontSize = 13,
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
        }
        Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = "Image Component",
                modifier = Modifier.fillMaxWidth().fillMaxHeight()
            )
        }

    }

}