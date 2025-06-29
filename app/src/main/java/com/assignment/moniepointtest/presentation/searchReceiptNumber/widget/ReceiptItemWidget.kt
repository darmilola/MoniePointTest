package com.assignment.moniepointtest.presentation.searchReceiptNumber.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.model.SearchReceiptItem
import com.assignment.moniepointtest.ui.theme.DarkGray
import com.assignment.moniepointtest.ui.theme.Green
import com.assignment.moniepointtest.ui.theme.LightGray
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun SearchShipmentNumberWidget(searchReceiptItem: SearchReceiptItem){

    val modifier  = Modifier
        .fillMaxWidth()
        .height(70.dp)

    Column(modifier = Modifier.fillMaxWidth().height(80.dp).padding(start = 10.dp, end = 10.dp)) {

        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier.fillMaxHeight().width(70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.box),
                    contentDescription = "Image Component",
                    modifier = Modifier.size(48.dp)
                )
            }
            Column(
                modifier = Modifier.wrapContentHeight().weight(4f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    TextComponent(
                        text = searchReceiptItem.itemName,
                        fontSize = 16,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color.Black,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 25,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth()
                    )
                }
                Row(
                    modifier = Modifier.wrapContentHeight().wrapContentWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    TextComponent(
                        text = searchReceiptItem.receiptNumber,
                        fontSize = 14,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = DarkGray,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        fontFamily = monaSansFamily,
                        lineHeight = 25,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth().padding(end = 5.dp)
                    )

                    Box(
                        modifier = Modifier.size(5.dp)
                            .background(color = DarkGray, shape = CircleShape)
                    )

                    TextComponent(
                        text = searchReceiptItem.fromCountry,
                        fontSize = 14,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = DarkGray,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        fontFamily = monaSansFamily,
                        lineHeight = 25,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth().padding(start = 5.dp, end = 5.dp)
                    )

                    ImageComponent(
                        modifier = Modifier.size(16.dp),
                        imageRes = R.drawable.right_arrow,
                        colorFilter = ColorFilter.tint(DarkGray)
                    )

                    TextComponent(
                        text = searchReceiptItem.toCountry,
                        fontSize = 14,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = DarkGray,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Normal,
                        fontFamily = monaSansFamily,
                        lineHeight = 25,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth().padding(start = 5.dp, end = 5.dp)
                    )
                }
            }

        }
        Box(
            modifier = Modifier.fillMaxWidth().height(1.dp)
                .background(color = LightGray)
        )

    }

}