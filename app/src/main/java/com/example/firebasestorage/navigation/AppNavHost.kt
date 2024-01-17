package com.example.firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.screens.contact.ContactScreen
import com.example.firebasestorage.screens.home.HomeScreen
import com.example.firebasestorage.screens.home.MyHomeScreen
import com.example.firebasestorage.screens.login.LoginScreen
import com.example.firebasestorage.screens.products.AddProductsScreen
import com.example.firebasestorage.screens.products.ViewProductsScreen
import com.example.firebasestorage.screens.signup.SignupScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_CONTACT){
            ContactScreen(navController)
        }

        composable(ROUT_UPLOAD){
            ContactScreen(navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(HOME_URL){
            MyHomeScreen(navController = navController)
        }




    }
}