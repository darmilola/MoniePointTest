package com.assignment.moniepointtest.presentation.shipment.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.model.ShippingModel
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.TextComponent

@Composable
fun ShipmentHistoryItemWidget(shippingModel: ShippingModel) {

         val modifier = Modifier
        .padding(bottom = 15.dp, start = 10.dp, end = 10.dp)
        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
        .fillMaxWidth()
        .height(230.dp)

        Row(modifier = modifier) {

            Column(modifier = Modifier
                .fillMaxWidth(0.70f).fillMaxHeight()
                .padding(start = 15.dp),
                horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {

                if(shippingModel.status == "progress"){
                    ProgressStatusWidget()
                }

                else if(shippingModel.status == "pending"){
                    PendingStatusWidget()
                }

                if(shippingModel.status == "loading"){
                    LoadingStatusWidget()
                }



                TextComponent(
                    text = "Arriving today!",
                    fontSize = 20,
                    textStyle = MaterialTheme.typography.titleMedium,
                    textColor = Color.Black,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = monaSansFamily,
                    lineHeight = 30,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textModifier = Modifier.fillMaxWidth().padding(top = 10.dp, bottom = 10.dp)
                )

                TextComponent(
                    text = "Your delivery, #NEJ20089934122231",
                    fontSize = 16,
                    textStyle = MaterialTheme.typography.titleMedium,
                    textColor = Color(0xff8d8d8d),
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Medium,
                    fontFamily = monaSansFamily,
                    lineHeight = 20,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textModifier = Modifier.wrapContentWidth()
                )
                TextComponent(
                    text = "from Atlanta, is arriving today!",
                    fontSize = 16,
                    textStyle = MaterialTheme.typography.titleMedium,
                    textColor = Color(0xff8d8d8d),
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Medium,
                    fontFamily = monaSansFamily,
                    lineHeight = 20,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textModifier = Modifier.wrapContentWidth()
                )

                Row(modifier = Modifier.fillMaxWidth().height(70.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start) {

                    TextComponent(
                        text = "$1400 USD",
                        fontSize = 18,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = PrimaryColor,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = monaSansFamily,
                        lineHeight = 20,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth().padding(end = 10.dp)
                    )

                    Box(
                        modifier = Modifier.size(5.dp)
                            .background(color = Color.LightGray, shape = CircleShape)
                    )

                    TextComponent(
                        text = "Sep 20,2023",
                        fontSize = 16,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color(0xff3a3e51),
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Medium,
                        fontFamily = monaSansFamily,
                        lineHeight = 18,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth().padding(start = 10.dp)
                    )
                }


            }

            Box(modifier = Modifier.fillMaxSize().padding(bottom = 15.dp, start = 10.dp, end = 10.dp)) {
                Image(
                    painter = painterResource(R.drawable.box_logo2),
                    contentDescription = "Image Component",
                    modifier = Modifier.fillMaxWidth().fillMaxHeight()
                )
            }


        }

}