package com.assignment.moniepointtest.presentation.home.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.assignment.moniepointtest.ui.theme.DarkGray
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun ShipmentNumberWidget(){

    val modifier  = Modifier
        .fillMaxWidth()
        .padding(start = 15.dp, end = 15.dp)
        .height(70.dp)

    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically) {

        Column(modifier = Modifier.wrapContentHeight().weight(4f), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
                    Box(
                        modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        TextComponent(
                            text = "Shipment Number",
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
                            text = "NEJ20089934122231",
                            fontSize = 16,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 25,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.wrapContentWidth()
                        )
                    }
                }

        Column(modifier = Modifier.fillMaxHeight().weight(1f), horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(R.drawable.cargo_handling),
                contentDescription = "Image Component",
                modifier = Modifier.size(48.dp)
            )

        }

    }

}