package com.assignment.moniepointtest.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.assignment.moniepointtest.presentation.home.widget.SearchBarWidget
import com.assignment.moniepointtest.presentation.home.widget.TopBarProfile
import com.assignment.moniepointtest.ui.theme.PrimaryColor

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(modifier = Modifier.fillMaxWidth().height(150.dp).background(color = PrimaryColor)) {

            Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()){
                TopBarProfile()
            }

            Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()){
                SearchBarWidget()
            }
        }

        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color.White)) {

        }


    }
}