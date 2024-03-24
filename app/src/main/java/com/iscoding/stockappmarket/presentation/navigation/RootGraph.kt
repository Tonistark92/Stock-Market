package com.iscoding.stockappmarket.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.iscoding.stockappmarket.presentation.company_info.CompanyInfoScreen
import com.iscoding.stockappmarket.presentation.company_listings.CompanyListingsScreen
import com.ramcosta.composedestinations.utils.composable

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.CompanyListing
    ) {
        composable(route = Screens.CompanyListing) {
            CompanyListingsScreen(navigator = navController)
        }
        composable(route = Screens.CompanyInfo+ "/{symbol}",
            arguments = listOf(navArgument("symbol") {
                type = NavType.StringType
                defaultValue = ""
            })) {
            val symbol = requireNotNull(it.arguments).getString("symbol")
            CompanyInfoScreen(symbol = symbol!!)
        }
    }
}
