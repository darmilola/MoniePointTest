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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import presentations.components.ImageComponent
import presentations.components.TextComponent
import presentations.components.TextFieldComponent


@Composable
fun DropDownWidget() {
    val modifier  = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color.White, shape = RoundedCornerShape(15.dp))

    Row(modifier = modifier) {

        Box(modifier = Modifier.height(60.dp).width(50.dp), contentAlignment = Alignment.Center){
            ImageComponent(modifier = Modifier
                .size(30.dp), imageRes = R.drawable.dropdown_box)
        }

        Box(modifier = Modifier.width(1.dp).fillMaxHeight().padding(top = 15.dp, bottom = 15.dp)) {
            Box(modifier = Modifier.width(1.dp).fillMaxHeight().background(color = Color.LightGray)){}
        }

        Box(modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(start = 10.dp), contentAlignment = Alignment.CenterStart) {
            TextComponent(
                text = "Box",
                fontSize = 18,
                textStyle = MaterialTheme.typography.titleMedium,
                textColor = Color.Black,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.SemiBold,
                fontFamily = monaSansFamily,
                lineHeight = 30,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textModifier =  Modifier
            )
        }

        Box(modifier = Modifier.fillMaxSize().padding(end = 20.dp), contentAlignment = Alignment.CenterEnd) {
            ImageComponent(modifier = Modifier
                .size(16.dp), imageRes = R.drawable.down_arrow, colorFilter = ColorFilter.tint(color = Color(0xff89888a)))
        }
    }
}