package com.assignment.moniepointtest.presentation.searchReceiptNumber

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.model.SearchReceiptItem
import com.assignment.moniepointtest.presentation.home.widget.AddStopWidget
import com.assignment.moniepointtest.presentation.home.widget.ReceiverWidget
import com.assignment.moniepointtest.presentation.home.widget.SenderWidget
import com.assignment.moniepointtest.presentation.home.widget.ShipmentNumberWidget
import com.assignment.moniepointtest.presentation.searchReceiptNumber.widget.SearchShipmentNumberWidget
import com.assignment.moniepointtest.presentation.searchReceiptNumber.widget.TopBarBarWidget
import com.assignment.moniepointtest.ui.theme.LessWhite
import com.assignment.moniepointtest.ui.theme.LightGray
import com.assignment.moniepointtest.ui.theme.PrimaryColor

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SearchReceiptScreen(onBackPressed:() -> Unit, sharedTransitionScope: SharedTransitionScope,
                        animatedContentScope: AnimatedContentScope
) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(LessWhite)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth().height(100.dp).background(color = PrimaryColor),
                contentAlignment = Alignment.Center
            ) {
                TopBarBarWidget(onBackPressed = {
                    onBackPressed()
                }, sharedTransitionScope, animatedContentScope)
            }

            Box(
                modifier = Modifier.wrapContentHeight().fillMaxWidth()
                    .padding(start = 15.dp, top = 10.dp, end = 15.dp),
                contentAlignment = Alignment.CenterStart
            ) {

                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.fillMaxWidth().height(400.dp)
                ) {
                    val list = populateList()
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(list){ item: SearchReceiptItem ->
                            SearchShipmentNumberWidget(item)
                        }
                    }




                }


            }

        }

}

fun populateList():ArrayList<SearchReceiptItem>{
    val list = arrayListOf<SearchReceiptItem>()
    val item1 = SearchReceiptItem(itemName = "Macbook pro M2", receiptNumber = "#NEJ20089934122231", fromCountry = "Paris", toCountry = "Morocco")
    val item2 = SearchReceiptItem(itemName = "Summer Linen Jacket", receiptNumber = "#NEJ20089934122231", fromCountry = "Barcelona", toCountry = "Paris")
    val item3 = SearchReceiptItem(itemName = "Tapered-fit jeans AW", receiptNumber = "#NEJ20089934122231", fromCountry = "Colombia", toCountry = "Paris")
    val item4 = SearchReceiptItem(itemName = "Slim fit jeans AW", receiptNumber = "#NEJ20089934122231", fromCountry = "Bogota", toCountry = "Dhaka")
    val item5 = SearchReceiptItem(itemName = "Office setup desk", receiptNumber = "#NEJ20089934122231", fromCountry = "France", toCountry = "German")

    list.add(item1)
    list.add(item2)
    list.add(item3)
    list.add(item4)
    list.add(item5)
    return list
}