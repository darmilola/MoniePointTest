package com.assignment.moniepointtest.components


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import presentations.components.ImageComponent
import presentations.components.TextComponent


@Composable
public fun ButtonComponent(modifier: Modifier, buttonText: String, borderStroke: BorderStroke?, shape: Shape, colors: ButtonColors, textColor: Color, fontSize: Int, style: TextStyle = TextStyle(), onClick: ()-> Unit) {
       Button(
             onClick = {
                  onClick()
             },
             border = borderStroke,
             shape = shape,
             modifier = modifier,
             colors = colors
       ){
           TextComponent(
               text = buttonText, fontSize = fontSize, textStyle = style, textColor = textColor, textAlign = TextAlign.Center,
               fontWeight = FontWeight.SemiBold)
        }
}


@Composable
public fun IconButtonComponent(modifier: Modifier, buttonText: String, borderStroke: BorderStroke?, shape: Shape, colors: ButtonColors, textColor: Color, fontSize: Int, style: TextStyle, iconRes: Int, iconSize: Int = 28, colorFilter: ColorFilter? = null, onClick: (() -> Unit)? = null) {
    val rowModifier = Modifier
        .fillMaxWidth().fillMaxHeight()

          Button(
                onClick = {
                    if (onClick != null) {
                        onClick()
                    }
                },
                border = borderStroke,
                shape = shape,
                modifier = modifier,
                colors = colors,
            ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = rowModifier
            ) {

                val iconModifier = Modifier
                .size(iconSize.dp)

                val iconBoxModifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.10f)

                val textModifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(end = 15.dp)
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = iconBoxModifier
                ) {
                    ImageComponent(modifier = iconModifier, imageRes = iconRes, colorFilter = colorFilter)
                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = textModifier
                ) {
                    TextComponent(
                        text = buttonText,
                        fontSize = fontSize,
                        textStyle = style,
                        textColor = textColor,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                        textModifier = Modifier.fillMaxWidth().wrapContentHeight()
                    )
                }
        }
    }
}




@Composable
fun BottomSheetIconButtonComponent(modifier: Modifier, buttonText: String, borderStroke: BorderStroke?, shape: Shape, colors: ButtonColors, textColor: Color, fontSize: Int, style: TextStyle, iconRes: Int, iconSize: Int = 28, colorFilter: ColorFilter? = null, onClick: (String) -> Unit) {
    val rowModifier = Modifier
        .fillMaxWidth()

    Button(
        onClick = {
            onClick(buttonText)
         },
        border = borderStroke,
        shape = shape,
        modifier = modifier,
        colors = colors,
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = rowModifier
        ) {

            val iconModifier = Modifier
                .padding(top = 5.dp)
                .size(iconSize.dp)

            val iconBoxModifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.10f)

            val textModifier = Modifier
                .padding(end = 15.dp)
                .wrapContentHeight()
                .fillMaxWidth(0.90f)
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top,
                modifier = iconBoxModifier
            ) {
                ImageComponent(modifier = iconModifier, imageRes = iconRes, colorFilter = colorFilter)
            }
            TextComponent(
                text = buttonText,
                fontSize = fontSize,
                textStyle = style,
                textColor = textColor,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold,
                textModifier = textModifier
            )
        }
    }
}
