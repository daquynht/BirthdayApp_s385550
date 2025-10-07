package com.example.birthdayapp_s385550.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.birthdayapp_s385550.data.Person

@Composable
fun PersonList(persons: List<Person>, onPersonClick: (Person) ->
Unit) {
    LazyColumn() {
        items(persons) { person ->
            PersonCard(person = person, onClick = {
                onPersonClick(person) })
        }
    }
}
