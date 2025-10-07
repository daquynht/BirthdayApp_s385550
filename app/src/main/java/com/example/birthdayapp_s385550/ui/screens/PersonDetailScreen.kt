package com.example.birthdayapp_s385550.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.birthdayapp_s385550.data.Person
import com.example.birthdayapp_s385550.ui.viewmodels.PersonViewModel

@Composable
fun PersonDetailScreen(navController: NavController, viewModel: PersonViewModel, person:
Person
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {Text(text = "Name: ${person.name}", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Age: ${person.age}", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
