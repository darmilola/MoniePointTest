package com.assignment.moniepointtest.presentation.home.widget

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.ui.theme.Orange
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextFieldComponent

@Composable
fun SearchBarWidget() {
    var text by remember { mutableStateOf("") }
    var borderStroke by remember { mutableStateOf(BorderStroke(1.dp, color  = Color.Gray)) }

    val modifier  = Modifier
        .padding(end = 10.dp, start = 10.dp, top = 20.dp)
        .fillMaxWidth()
        .height(50.dp)
        .background(color = Color.White, shape = CircleShape)

    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically) {

        Box(modifier = Modifier.fillMaxHeight().weight(1f), contentAlignment = Alignment.Center){
            ImageComponent(modifier = Modifier
                .size(18.dp).clickable {
                   /* if(iconResValue == "drawable/back_arrow.png"){
                        text = ""
                        iconResValue = "drawable/search_icon.png"
                        onBackPressed()
                    }*/
                }, imageRes = R.drawable.search, colorFilter = ColorFilter.tint(color = PrimaryColor))
        }

        Box(modifier = Modifier.fillMaxHeight().weight(6f), contentAlignment = Alignment.Center) {
            TextFieldComponent(
                text = text,
                readOnly = false,
                textStyle = TextStyle(),
                modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(end = 10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                onValueChange = {
                    text = it
                    //onValueChange(it)
                },
                isSingleLine = true,
                placeholderText = "Enter the receipt number...",
                onFocusChange = { it ->
                    borderStroke = if (it) {
                        BorderStroke(1.dp, color = PrimaryColor)
                    } else {
                        BorderStroke(1.dp, color = Color.Gray)
                    }
                },
                isPasswordField = false,
                placeholderTextSize = 17f
            )
        }
        Box(modifier = Modifier.fillMaxHeight().weight(1f).padding(5.dp), contentAlignment = Alignment.Center){

            Box(modifier = Modifier.fillMaxSize().background(color = Orange, shape = CircleShape), contentAlignment = Alignment.Center){

                ImageComponent(modifier = Modifier
                    .size(18.dp), imageRes = R.drawable.filter, colorFilter = ColorFilter.tint(color = Color.White))
            }
        }
    }
}
