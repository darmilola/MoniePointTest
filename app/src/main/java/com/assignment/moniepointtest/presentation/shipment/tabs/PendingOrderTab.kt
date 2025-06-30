package com.assignment.moniepointtest.presentation.shipment.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.model.ShippingModel
import com.assignment.moniepointtest.presentation.shipment.widget.ShipmentHistoryItemWidget
import com.assignment.moniepointtest.ui.theme.LessWhite
import presentations.components.TextComponent

@Composable
fun PendingOrderTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LessWhite),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier.height(60.dp).fillMaxWidth()
                .padding(start = 20.dp, top = 10.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            TextComponent(
                text = "Shipments",
                fontSize = 25,
                textStyle = MaterialTheme.typography.titleMedium,
                textColor = Color.Black,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.SemiBold,
                fontFamily = monaSansFamily,
                lineHeight = 30,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textModifier = Modifier.fillMaxWidth()
            )
        }
        Box(
            modifier = Modifier.wrapContentHeight().fillMaxWidth()
                .padding(start = 15.dp, top = 10.dp, end = 15.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            val list = populatePendingShippingList()
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(list) { item: ShippingModel ->
                    ShipmentHistoryItemWidget(shippingModel = item)
                }
            }

        }
    }
}

fun populatePendingShippingList():ArrayList<ShippingModel>{
    val list = arrayListOf<ShippingModel>()
    val item1 = ShippingModel(status = "pending")
    val item2 = ShippingModel(status = "pending")
    val item3 = ShippingModel(status = "pending")
    val item4 = ShippingModel(status = "pending")


    list.add(item1)
    list.add(item2)
    list.add(item3)
    list.add(item4)
    return list
}