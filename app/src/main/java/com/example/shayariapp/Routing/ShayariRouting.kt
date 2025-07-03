package com.example.shayariapp.Routing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shayariapp.CategoryScreen
import com.example.shayariapp.FinalShayariScreen
import com.example.shayariapp.ShayariListScreen
import com.example.shayariapp.SplashScreen

@Composable
fun ShayariRouting(navHostController : NavHostController){
    NavHost(navController = navHostController, startDestination = ShayariRoutingItem.splashScreen.route) {
        composable(ShayariRoutingItem.categoryScreen.route){
            CategoryScreen(navHostController)
        }
        composable(ShayariRoutingItem.splashScreen.route){
            SplashScreen(navHostController)
        }
        composable(ShayariRoutingItem.shayariListScreen.route+"/{title}"){
            val title = it.arguments?.getString("title")
            ShayariListScreen(navHostController,title)
        }
        composable(ShayariRoutingItem.FinalShayariScreen.route+"/{item}"+"/{title}"){
            val item = it.arguments?.getString("item").toString()
            val title = it.arguments?.getString("title").toString()
            FinalShayariScreen(navHostController, item, title)
        }
    }


}