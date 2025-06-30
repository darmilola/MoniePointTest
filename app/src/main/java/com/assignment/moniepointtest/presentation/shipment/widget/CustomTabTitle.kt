package com.assignment.moniepointtest.presentation.shipment.widget

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
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
import com.assignment.moniepointtest.model.ShipmentTabTitleModel
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun CustomTabTitle(shipmentTabTitleModel: ShipmentTabTitleModel, isSelected: Boolean) {
    val textColor: Color = if(isSelected){
        Color.White
    }
    else {
        Color(0xffc2b1ee)
    }

    val bgColor: Color = if(isSelected){
        Color(0xfff38528)
    }
    else {
        Color(0xff7258c3)
    }


    Row(
        modifier = Modifier
            .wrapContentWidth()
            .height(35.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextComponent(
            text = shipmentTabTitleModel.title,
            fontSize = 18,
            textStyle = TextStyle(),
            textColor = textColor,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            fontFamily = monaSansFamily,
            lineHeight = 30,
            textModifier = Modifier.padding(end = 5.dp))

        if (shipmentTabTitleModel.pendingCount != 0) {

            Box(
                modifier = Modifier.height(20.dp).width(30.dp)
                    .background(color = bgColor, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                TextComponent(
                    text = shipmentTabTitleModel.pendingCount.toString(),
                    fontSize = 14,
                    textStyle = TextStyle(),
                    textColor = textColor,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    fontFamily = monaSansFamily,
                    lineHeight = 30,
                    textModifier = Modifier
                )
            }
        }


    }
}