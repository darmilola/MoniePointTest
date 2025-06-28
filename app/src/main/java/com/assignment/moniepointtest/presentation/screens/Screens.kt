package com.assignment.moniepointtest.presentation.screens

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home")
    data object CalculateScreen : Screen("calculate")
    data object ShipmentScreen : Screen("shipment")
    data object ProfileScreen : Screen("profile")
    data object SearchReceiptScreen : Screen("search_receipt")
}