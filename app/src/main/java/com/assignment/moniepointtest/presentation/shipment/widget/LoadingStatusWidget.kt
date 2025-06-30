package com.assignment.moniepointtest.presentation.shipment.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun LoadingStatusWidget() {


    Row(
        modifier = Modifier
            .background(color = Color(0xfff6f6f6), shape = CircleShape)
            .width(120.dp)
            .height(40.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {


        Box(modifier = Modifier.fillMaxHeight().width(30.dp), contentAlignment = Alignment.Center) {

            ImageComponent(
                modifier = Modifier.size(18.dp),
                imageRes = R.drawable.rotate,
                colorFilter = ColorFilter.tint(color = Color(0xff77a5d0))
            )
        }


        TextComponent(
            text = "loading",
            fontSize = 17,
            textStyle = TextStyle(),
            textColor = Color(0xff77a5d0),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            fontFamily = monaSansFamily,
            lineHeight = 30,
            textModifier = Modifier.padding(start = 3.dp))

    }
}
