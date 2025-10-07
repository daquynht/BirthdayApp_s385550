package com.example.birthdayapp_s385550

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.birthdayapp_s385550.ui.navigation.MyNavHost
import com.example.birthdayapp_s385550.ui.viewmodels.PersonViewModel

@Composable
fun MyApp( modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val viewModel : PersonViewModel = viewModel()
    MyNavHost(
        navController =navController,viewModel=viewModel)
}
