package com.assignment.moniepointtest.presentation.shipment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.model.ShipmentTabTitleModel
import com.assignment.moniepointtest.presentation.calculate.widgets.CalculateTopBarWidget
import com.assignment.moniepointtest.presentation.shipment.tabs.AllTab
import com.assignment.moniepointtest.presentation.shipment.tabs.CompletedTab
import com.assignment.moniepointtest.presentation.shipment.tabs.InProgressTab
import com.assignment.moniepointtest.presentation.shipment.tabs.PendingOrderTab
import com.assignment.moniepointtest.presentation.shipment.tabs.ShipmentTopBarWidget
import com.assignment.moniepointtest.presentation.shipment.widget.CustomTabTitle
import com.assignment.moniepointtest.ui.theme.LessWhite
import com.assignment.moniepointtest.ui.theme.MoniePointTestTheme
import com.assignment.moniepointtest.ui.theme.PrimaryColor

@Composable
fun ShipmentScreen() {
    MoniePointTestTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(LessWhite),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth().height(40.dp).background(color = PrimaryColor),
                contentAlignment = Alignment.Center
            ) {
                ShipmentTopBarWidget()
            }
            var tabIndex by remember { mutableStateOf(0) }

            val tabs = populateShipmentTabTitle()

            Column(modifier = Modifier.fillMaxWidth()) {
                ScrollableTabRow(selectedTabIndex = tabIndex,
                    containerColor = PrimaryColor,
                    contentColor = Color.White,
                    indicator = { tabPositions ->
                        Box(
                            modifier = Modifier
                                .tabIndicatorOffset(tabPositions[tabIndex])
                                .height(4.dp)
                                .clip(RoundedCornerShape(8.dp)) // clip modifier not working
                                .padding(horizontal = 28.dp)
                                .background(color = Color(0xfff38528))
                        )

                    }) {
                    tabs.forEachIndexed { index, title ->
                        Tab(text = { CustomTabTitle(shipmentTabTitleModel = tabs[index], isSelected = tabIndex == index)  },
                            selected = tabIndex == index,
                            onClick = { tabIndex = index }
                        )
                    }
                }
                when (tabIndex) {
                    0 -> AllTab()
                    1 -> CompletedTab()
                    2 -> InProgressTab()
                    3 -> PendingOrderTab()
                    4 -> AllTab()

                }
            }
        }
    }

}

fun populateShipmentTabTitle(): ArrayList<ShipmentTabTitleModel>{
    val titleList = arrayListOf<ShipmentTabTitleModel>()
    val inProgress = ShipmentTabTitleModel(title = "In progress", pendingCount = 3)
    val pendingOrder = ShipmentTabTitleModel(title = "Pending order", pendingCount = 4)
    val cancelled = ShipmentTabTitleModel(title = "Cancelled", pendingCount = 0)
    val all = ShipmentTabTitleModel(title = "All", pendingCount = 12)
    val completed = ShipmentTabTitleModel(title = "Completed", pendingCount = 5)

    titleList.add(all)
    titleList.add(completed)
    titleList.add(inProgress)
    titleList.add(pendingOrder)
    titleList.add(cancelled)

    return titleList
}
