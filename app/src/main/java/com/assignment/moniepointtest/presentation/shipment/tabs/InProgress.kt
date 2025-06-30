package com.assignment.moniepointtest.presentation.shipment.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.assignment.moniepointtest.ui.theme.LessWhite
import com.assignment.moniepointtest.ui.theme.MoniePointTestTheme

@Composable
fun InProgressTab() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(LessWhite),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Icon on the screen
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "shipment",
                tint = Color(0xFF0F9D58)
            )
            // Text on the screen
            Text(text = "In Progress", color = Color.Black)
        }
}