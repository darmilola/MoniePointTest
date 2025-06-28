package com.assignment.moniepointtest.presentation.home.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.ImageComponent
import presentations.components.TextComponent

@Composable
fun TopBarProfile(){
    Row(modifier = Modifier.fillMaxWidth().height(50.dp), verticalAlignment = Alignment.CenterVertically) {
        Row(modifier = Modifier.weight(5f).height(50.dp)) {
            Box(modifier = Modifier.weight(0.7f).fillMaxHeight(), contentAlignment = Alignment.Center) {

                Box(Modifier.size(50.dp), contentAlignment = Alignment.Center) {
                    Box(
                        Modifier
                            .size(50.dp)
                            .background(color = Color.Transparent)
                    ) {
                        val modifier = Modifier
                            .clip(CircleShape)
                            .fillMaxSize()
                        ImageComponent(modifier = modifier, imageRes = R.drawable.man)
                    }
                }

            }
            Column(modifier = Modifier.weight(3f).fillMaxHeight(), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {

                Row(modifier = Modifier.fillMaxWidth().weight(1f)) {

                    Box(
                        modifier = Modifier.fillMaxHeight().width(25.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        ImageComponent(
                            modifier = Modifier.size(14.dp),
                            imageRes = R.drawable.navigation,
                            colorFilter = ColorFilter.tint(Color.LightGray)
                        )
                    }
                    Box(
                        modifier = Modifier.fillMaxHeight().wrapContentWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        TextComponent(
                            text = "Your Location",
                            fontSize = 14,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.LightGray,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Normal,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.fillMaxWidth()
                        )
                    }
                }

                Row(modifier = Modifier.fillMaxWidth().weight(1f)){
                    Box(
                        modifier = Modifier.fillMaxHeight().wrapContentWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        TextComponent(
                            text = "Wertheimer, Illinois",
                            fontSize = 16,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.White,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Normal,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.wrapContentWidth()
                        )
                    }
                    Box(modifier = Modifier.fillMaxHeight().width(20.dp), contentAlignment = Alignment.Center) {
                        ImageComponent(
                            modifier = Modifier.size(10.dp),
                            imageRes = R.drawable.down_arrow,
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                }

            }
        }
        Box(modifier = Modifier.weight(1f).height(50.dp), contentAlignment = Alignment.Center) {
            Box(Modifier.size(50.dp), contentAlignment = Alignment.Center) {
                Box(
                    Modifier
                        .size(40.dp)
                        .background(color = Color.White, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    val modifier = Modifier
                        .size(24.dp)
                    ImageComponent(modifier = modifier, imageRes = R.drawable.bell)
                }
            }
        }
    }
}