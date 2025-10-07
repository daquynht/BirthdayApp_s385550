package com.example.birthdayapp_s385550.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.birthdayapp_s385550.ui.viewmodels.PersonViewModel
import androidx.compose.runtime.getValue

@Composable
fun PersonApp(vm: PersonViewModel) {
    val persons by vm.persons.collectAsState()
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Navn") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Alder") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                if (name.isNotBlank() && age.isNotBlank()) {
                    vm.addPerson(name, age.toInt())
                    name = ""
                    age = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Legg til person")
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(persons) { person ->
                Text("${person.name}, Alder: ${person.age}")
                Divider()
            }
        }
    }
}