package com.assignment.moniepointtest.presentation.home.widget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun AddStopWidget() {

    val modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 10.dp)
        .height(50.dp)

    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {

        ImageComponent(
            modifier = Modifier.size(14.dp),
            imageRes = R.drawable.plus,
            colorFilter = ColorFilter.tint(Color(0xffeba669))
        )

        TextComponent(
            text = "Add Stop",
            fontSize = 16,
            textStyle = MaterialTheme.typography.titleMedium,
            textColor = Color(0xffeba669),
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Medium,
            lineHeight = 25,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textModifier = Modifier.wrapContentWidth().padding(start = 5.dp)
        )
    }

}