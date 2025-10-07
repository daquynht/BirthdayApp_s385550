package com.example.birthdayapp_s385550.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.birthdayapp_s385550.data.Person
import com.example.birthdayapp_s385550.ui.screens.ListeSide
import com.example.birthdayapp_s385550.ui.screens.PersonDetailScreen
import com.example.birthdayapp_s385550.ui.viewmodels.PersonViewModel

@Composable
fun MyNavHost (navController: NavHostController, viewModel: PersonViewModel= viewModel()) {
    NavHost(navController = navController, startDestination = "personList") {
        composable("personList") {
            ListeSide(navController=navController, viewModel=viewModel)
        }
        composable("personDetail"){
            PersonDetailScreen(navController=navController ,viewModel= viewModel,
                person = Person("Ole", 30))
    }
    }
}

