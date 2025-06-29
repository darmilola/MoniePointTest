package com.assignment.moniepointtest.presentation.calculate

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.assignment.moniepointtest.R
import com.assignment.moniepointtest.components.monaSansFamily
import com.assignment.moniepointtest.model.CategoryItemModel
import com.assignment.moniepointtest.model.CategoryItemUIModel
import com.assignment.moniepointtest.presentation.calculate.widgets.CalculateTopBarWidget
import com.assignment.moniepointtest.presentation.calculate.widgets.CategoryItem
import com.assignment.moniepointtest.presentation.calculate.widgets.DestinationWidget
import com.assignment.moniepointtest.presentation.calculate.widgets.DropDownWidget
import com.assignment.moniepointtest.ui.theme.DarkGray
import com.assignment.moniepointtest.ui.theme.LessWhite
import com.assignment.moniepointtest.ui.theme.MoniePointTestTheme
import com.assignment.moniepointtest.ui.theme.PrimaryColor
import presentations.components.TextComponent

@Composable
fun CalculateScreen(onNavigateToEstimate:() -> Unit) {
    MoniePointTestTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(LessWhite)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth().height(50.dp).background(color = PrimaryColor),
                contentAlignment = Alignment.Center
            ) {
                CalculateTopBarWidget()
            }

            Column(
                modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = LessWhite)
                    .verticalScroll(rememberScrollState())
            ) {

                Column(modifier = Modifier.fillMaxWidth().height(330.dp)) {

                    Box(
                        modifier = Modifier.height(60.dp).fillMaxWidth()
                            .padding(start = 20.dp, top = 10.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        TextComponent(
                            text = "Destination",
                            fontSize = 20,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.fillMaxWidth()
                        )
                    }

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 15.dp, top = 5.dp, end = 15.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {

                        Card(
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier.fillMaxWidth().height(250.dp)
                        ) {

                            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                                Box(
                                    modifier = Modifier.fillMaxWidth().wrapContentHeight()
                                        .padding(top = 15.dp, start = 15.dp, end = 15.dp)
                                ) {
                                    DestinationWidget(
                                        icon = R.drawable.top_up,
                                        placeholder = "Sender location"
                                    ) {

                                    }
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth().wrapContentHeight()
                                        .padding(top = 15.dp, start = 15.dp, end = 15.dp)
                                ) {
                                    DestinationWidget(
                                        icon = R.drawable.down_right_arrow,
                                        placeholder = "Receiver location"
                                    ) {

                                    }
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth().wrapContentHeight()
                                        .padding(top = 15.dp, start = 15.dp, end = 15.dp)
                                ) {
                                    DestinationWidget(
                                        icon = R.drawable.scale,
                                        placeholder = "Approx location"
                                    ) {

                                    }
                                }
                            }

                        }

                    }

                }


                Column(modifier = Modifier.fillMaxWidth().height(150.dp)) {

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 20.dp, top = 10.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        TextComponent(
                            text = "Packaging",
                            fontSize = 20,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.fillMaxWidth()
                        )
                    }

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 20.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        TextComponent(
                            text = "What are you sending?",
                            fontSize = 18,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = DarkGray,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.fillMaxWidth()
                        )
                    }

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 15.dp, top = 15.dp, end = 15.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {

                        Card(
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier.fillMaxWidth().height(60.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                DropDownWidget()
                            }

                        }

                    }

                }

                Column(modifier = Modifier.fillMaxWidth().height(300.dp)) {

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 20.dp, top = 20.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        TextComponent(
                            text = "Categories",
                            fontSize = 20,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.fillMaxWidth()
                        )
                    }

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 20.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        TextComponent(
                            text = "What are you sending?",
                            fontSize = 18,
                            textStyle = MaterialTheme.typography.titleMedium,
                            textColor = DarkGray,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = monaSansFamily,
                            lineHeight = 30,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            textModifier = Modifier.fillMaxWidth()
                        )
                    }

                    Box(
                        modifier = Modifier.wrapContentHeight().fillMaxWidth()
                            .padding(start = 15.dp, top = 10.dp, end = 15.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {

                        val categoryList = populateCategoryList()

                        var categoryItemModelUIModel by remember {
                            mutableStateOf(
                                CategoryItemUIModel(
                                    selectedCategory = CategoryItemModel(),
                                    categoryList
                                )
                            )
                        }

                        LazyVerticalGrid(
                            columns = GridCells.Fixed(3),
                            modifier = Modifier.fillMaxWidth().height(300.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp),
                            userScrollEnabled = false,
                            horizontalArrangement = Arrangement.spacedBy(2.dp)
                        ) {

                            items(categoryItemModelUIModel.visibleCategory.size) { i ->
                                CategoryItem(
                                    categoryItemModelUIModel.visibleCategory[i],
                                    onCategorySelectedListener = { it ->
                                        categoryItemModelUIModel = categoryItemModelUIModel.copy(
                                            selectedCategory = it,
                                            visibleCategory = categoryItemModelUIModel.visibleCategory.map { it2 ->
                                                it2.copy(
                                                    isSelected = it2.categoryId == it.categoryId
                                                )
                                            }

                                        )
                                    })
                            }

                        }

                    }

                }

                Box(
                    modifier = Modifier.fillMaxWidth().height(70.dp).clickable {
                        onNavigateToEstimate()
                    }.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                        .background(color = Color(0xffee8a3c), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    TextComponent(
                        text = "Calculate",
                        fontSize = 18,
                        textStyle = MaterialTheme.typography.titleMedium,
                        textColor = Color.White,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Medium,
                        fontFamily = monaSansFamily,
                        lineHeight = 30,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        textModifier = Modifier.wrapContentWidth()
                    )
                }
            }

        }
    }
}

fun populateCategoryList(): ArrayList<CategoryItemModel>{
    val categoryList = arrayListOf<CategoryItemModel>()

    val item1 = CategoryItemModel(categoryName = "Documents", categoryId = 1)
    val item2 = CategoryItemModel(categoryName = "Glass", categoryId = 2)
    val item3 = CategoryItemModel(categoryName = "Liquid", categoryId = 3)
    val item4 = CategoryItemModel(categoryName = "Food", categoryId = 4)
    val item5 = CategoryItemModel(categoryName = "Electronic", categoryId = 5)
    val item6 = CategoryItemModel(categoryName = "Product", categoryId = 6)
    val item7 = CategoryItemModel(categoryName = "Others", categoryId = 7)

    categoryList.add(item1)
    categoryList.add(item2)
    categoryList.add(item3)
    categoryList.add(item4)
    categoryList.add(item5)
    categoryList.add(item6)
    categoryList.add(item7)

    return categoryList

}