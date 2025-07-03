package com.example.shayariapp.Routing

sealed class ShayariRoutingItem(val route: String) {
    object splashScreen : ShayariRoutingItem("splash")
    object categoryScreen : ShayariRoutingItem("category")
    object shayariListScreen : ShayariRoutingItem("shayari_list")
    object FinalShayariScreen : ShayariRoutingItem("final_shayari")

}