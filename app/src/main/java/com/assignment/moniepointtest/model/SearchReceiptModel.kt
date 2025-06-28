package com.assignment.moniepointtest.model

import androidx.compose.ui.graphics.vector.ImageVector

data class SearchReceiptItem(
    val itemName: String,
    val receiptNumber: String,
    val fromCountry: String,
    val toCountry: String)