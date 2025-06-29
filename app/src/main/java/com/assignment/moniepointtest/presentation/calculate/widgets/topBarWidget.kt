package com.assignment.moniepointtest.presentation.calculate.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun CalculateTopBarWidget() {

    val modifier = Modifier
        .fillMaxWidth()
        .background(color = PrimaryColor)
        .height(60.dp)

    Box(modifier = modifier) {

        Box(modifier = Modifier.fillMaxHeight().width(50.dp), contentAlignment = Alignment.Center) {

        }

        Box(modifier = Modifier.fillMaxSize().padding(start = 50.dp, end = 50.dp), contentAlignment = Alignment.Center) {
            TextComponent(
                text = "Calculate",
                fontSize = 18,
                textStyle = MaterialTheme.typography.titleMedium,
                textColor = Color.White,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Normal,
                lineHeight = 25,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textModifier = Modifier.wrapContentWidth()
            )
        }

        Box(modifier = Modifier.fillMaxHeight().width(50.dp), contentAlignment = Alignment.CenterEnd) {

        }




    }

}