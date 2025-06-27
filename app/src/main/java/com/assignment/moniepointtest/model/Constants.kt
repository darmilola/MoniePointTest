package com.assignment.moniepointtest.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn

object Constants {
    val BottomNavItems = listOf(
        // Home screen
        BottomNavItem(
            label = "Home",
            icon = Icons.Outlined.Home,
            route = "home"
        ),
        // Calculate screen
        BottomNavItem(
            label = "Calculate",
            icon = Icons.Outlined.DateRange,
            route = "calculate"
        ),
        // Shipment screen
        BottomNavItem(
            label = "Shipment",
            icon = Icons.Filled.Person,
            route = "shipment"
        ),
        // Profile screen
        BottomNavItem(
          label = "Profile",
          icon = Icons.Filled.Person,
          route = "profile"
        )

    )
}