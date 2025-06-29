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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
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
import com.assignment.moniepointtest.ui.theme.DarkGray
import com.assignment.moniepointtest.ui.theme.Orange
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextComponent
import presentations.components.TextFieldComponent

@Composable
fun SearchBarWidget(onFocused:() -> Unit, onValueChange:(String) -> Unit) {
    var text by remember { mutableStateOf("") }
    val modifier  = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(color = Color.White, shape = CircleShape)

    Box(modifier = modifier) {

        Box(modifier = Modifier.height(50.dp).width(40.dp), contentAlignment = Alignment.Center){
            ImageComponent(modifier = Modifier
                .size(16.dp), imageRes = R.drawable.search, colorFilter = ColorFilter.tint(color = PrimaryColor))
        }

        Box(modifier = Modifier.fillMaxSize().padding(start = 40.dp, end = 50.dp), contentAlignment = Alignment.Center) {
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
                placeholderText = "Enter the receipt number...",
                onFocusChange = { it ->
                    if (it){
                        onFocused()
                    }
                   },
                isPasswordField = false,
                placeholderTextSize = 15f
            )
        }
        Box(modifier = Modifier.fillMaxSize().padding(5.dp), contentAlignment = Alignment.CenterEnd){

            Box(modifier = Modifier.size(40.dp).background(color = Orange, shape = CircleShape), contentAlignment = Alignment.Center){

                ImageComponent(modifier = Modifier
                    .size(18.dp), imageRes = R.drawable.filter, colorFilter = ColorFilter.tint(color = Color.White))
            }
        }
    }
}


@Composable
fun HomeSearchBarWidget(onFocused:() -> Unit) {
    var text by remember { mutableStateOf("") }
    val modifier  = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(color = Color.White, shape = CircleShape)

    Box(modifier = modifier) {

        Box(modifier = Modifier.height(50.dp).width(40.dp), contentAlignment = Alignment.Center){
            ImageComponent(modifier = Modifier
                .size(16.dp), imageRes = R.drawable.search, colorFilter = ColorFilter.tint(color = PrimaryColor))
        }

        Box(modifier = Modifier.fillMaxSize().padding(start = 40.dp, end = 50.dp), contentAlignment = Alignment.Center) {
            TextComponent(
                text = "Enter the receipt number...",
                fontSize = 16,
                textStyle = MaterialTheme.typography.titleMedium,
                textColor = DarkGray,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Normal,
                fontFamily = monaSansFamily,
                lineHeight = 30,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textModifier = Modifier.wrapContentHeight().fillMaxWidth().padding(end = 10.dp).clickable {
                    onFocused()
                },
            )
        }
        Box(modifier = Modifier.fillMaxSize().padding(5.dp), contentAlignment = Alignment.CenterEnd){

            Box(modifier = Modifier.size(40.dp).background(color = Orange, shape = CircleShape), contentAlignment = Alignment.Center){

                ImageComponent(modifier = Modifier
                    .size(18.dp), imageRes = R.drawable.filter, colorFilter = ColorFilter.tint(color = Color.White))
            }
        }
    }
}
