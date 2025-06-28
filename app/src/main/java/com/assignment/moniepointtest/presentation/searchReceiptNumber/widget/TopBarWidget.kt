package com.assignment.moniepointtest.presentation.searchReceiptNumber.widget

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.presentation.home.widget.SearchBarWidget
import presentations.components.ImageComponent

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun TopBarBarWidget(onBackPressed:() -> Unit, sharedTransitionScope: SharedTransitionScope,
                    animatedContentScope: AnimatedContentScope
) {
    val boundsTransform = { _: Rect, _: Rect -> tween<Rect>(400) }


    with(sharedTransitionScope) {

        val modifier = Modifier
            .padding(end = 10.dp, start = 10.dp)
            .fillMaxWidth()
            .height(50.dp)

        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier.fillMaxHeight().width(30.dp),
                contentAlignment = Alignment.Center
            ) {
                ImageComponent(
                    modifier = Modifier.size(16.dp).clickable {
                        onBackPressed()
                    },
                    imageRes = R.drawable.left,
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }

            Box(
                modifier = Modifier
                    .sharedElement(
                        rememberSharedContentState(key = "searchWidget"),
                        animatedVisibilityScope = animatedContentScope,
                        boundsTransform = boundsTransform
                    )
                    .fillMaxHeight().fillMaxWidth(), contentAlignment = Alignment.Center
            ) {
                SearchBarWidget(onFocused = {}, onValueChange = {})
            }
        }
    }
}