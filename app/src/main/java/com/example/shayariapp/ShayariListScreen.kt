package com.example.shayariapp

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayariapp.Routing.ShayariRoutingItem
import com.example.shayariapp.ui.theme.primary
import com.example.shayariapp.ui.theme.primaryLight
import com.example.shayariapp.ui.theme.purple

@Composable
@Preview
fun PreviewShayariList() {
    ShayariListScreen(title = "Love")
}

@Composable
fun ShayariListScreen(navHostController: NavHostController? = null, title: String?) {
    Surface {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primary)
        ) {
            Column {
                MainToolBar(title = title.toString()) { navHostController?.popBackStack()}

                val myFinalList = getList().filter {
                    it.title == title.toString()
                }
                val finalList = myFinalList[0]
                finalList.list?.let { list ->
                    LazyColumn {
                        items(list) { item ->
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 15.dp, top = 15.dp, end = 15.dp)
                                    .clickable {
                                        navHostController?.navigate(ShayariRoutingItem.FinalShayariScreen.route + "/${item}"+"/${title}" )
                                    },
                                colors = CardDefaults.cardColors(containerColor = primaryLight)
                            ) {
                                Text(
                                    text = item,
                                    style = TextStyle(fontSize = 18.sp),
                                    color = Color.White,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(10.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}