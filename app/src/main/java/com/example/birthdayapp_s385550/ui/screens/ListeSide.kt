package com.example.birthdayapp_s385550.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.birthdayapp_s385550.ui.components.PersonList
import com.example.birthdayapp_s385550.ui.viewmodels.PersonViewModel

@Composable
fun ListeSide(navController: NavHostController, viewModel:
PersonViewModel
) {
    PersonList(viewModel.personer, onPersonClick = {
        navController.navigate("personDetail") })
}
