package com.example.birthdayapp_s385550

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.example.birthdayapp_s385550.data.AppDatabase
import com.example.birthdayapp_s385550.repositories.PersonRepository
import com.example.birthdayapp_s385550.ui.screens.PersonApp
import com.example.birthdayapp_s385550.ui.theme.BirthdayApp_s385550Theme
import com.example.birthdayapp_s385550.ui.viewmodels.PersonViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "person_db"
        ).build()
        val repository = PersonRepository(db.personDao())
        val viewModel= PersonViewModel(repository, application)
        setContent {
            PersonApp(viewModel)
        }
    }
}

