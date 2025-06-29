package com.assignment.moniepointtest.presentation.calculate.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import com.assignment.moniepointtest.model.CategoryItemModel
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun CategoryItem(categoryItemModel: CategoryItemModel, onCategorySelectedListener: (CategoryItemModel) -> Unit) {
    val textColor: Color = if(categoryItemModel.isSelected){
        Color.White
    }
    else {
        Color(0xff132333)
    }

    val bgColor: Color = if(categoryItemModel.isSelected){
        Color(0xff132333)
    }
    else {
        Color.Transparent
    }

    val borderColor: Color = if(categoryItemModel.isSelected){
        Color(0xff132333)
    }
    else {
        Color.LightGray
    }

    val showSelectIcon = remember { mutableStateOf(false) }

    showSelectIcon.value = categoryItemModel.isSelected

    Row(
        modifier = Modifier
            .padding(start = 3.dp, end = 3.dp, top = 10.dp)
            .wrapContentWidth()
            .defaultMinSize(minWidth = 120.dp)
            .clickable {
                onCategorySelectedListener(categoryItemModel)
            }
            .background(color = bgColor, shape = RoundedCornerShape(12.dp))
            .border(border = BorderStroke((1.5).dp, borderColor), shape = RoundedCornerShape(12.dp))
            .height(45.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        if(showSelectIcon.value){
            ImageComponent(modifier = Modifier.size(16.dp), imageRes = R.drawable.check, colorFilter = ColorFilter.tint(color = Color.White))
        }

        TextComponent(
            text = categoryItemModel.categoryName,
            fontSize = 15,
            textStyle = TextStyle(),
            textColor = textColor,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = monaSansFamily,
            lineHeight = 30,
            textModifier = Modifier.padding(start = 5.dp))

    }
}
