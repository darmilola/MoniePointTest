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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.presentation.searchReceiptNumber.widget.TopBarBarWidget
import com.assignment.moniepointtest.ui.theme.LessWhite
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

        }

}