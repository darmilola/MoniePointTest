package com.assignment.moniepointtest.presentation.calculate.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.ui.theme.Orange
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextFieldComponent

@Composable
fun DestinationWidget(icon:Int, placeholder: String, onValueChange:(String) -> Unit) {
    var text by remember { mutableStateOf("") }
    val modifier  = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xfff8f8f8), shape = RoundedCornerShape(10.dp))

    Row(modifier = modifier) {

        Box(modifier = Modifier.height(60.dp).width(50.dp), contentAlignment = Alignment.Center){
            ImageComponent(modifier = Modifier
                .size(24.dp), imageRes = icon, colorFilter = ColorFilter.tint(color = Color(0xff89888a)))
        }

        Box(modifier = Modifier.width(1.dp).fillMaxHeight().padding(top = 15.dp, bottom = 15.dp)) {
            Box(modifier = Modifier.width(1.dp).fillMaxHeight().background(color = Color.LightGray)){}
        }

        Box(modifier = Modifier.fillMaxSize().padding(start = 10.dp), contentAlignment = Alignment.Center) {
            TextFieldComponent(
                text = text,
                readOnly = false,
                textStyle = TextStyle(),
                modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(end = 10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                onValueChange = {
                    text = it
                    onValueChange(it)
                },
                isSingleLine = true,
                placeholderText = placeholder,
                onFocusChange = { it -> },
                isPasswordField = false,
                placeholderTextSize = 16f
            )
        }
    }
}