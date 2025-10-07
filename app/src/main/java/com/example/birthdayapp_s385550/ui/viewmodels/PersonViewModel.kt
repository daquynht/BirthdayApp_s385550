package com.example.birthdayapp_s385550.ui.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.birthdayapp_s385550.data.Person
import com.example.birthdayapp_s385550.repositories.PersonRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class PersonViewModel(private val repository:
                      PersonRepository,application: Application
) :
    AndroidViewModel(application) {
    val persons: StateFlow<List<Person>> =
        repository.allPersons.stateIn(viewModelScope,
            SharingStarted.Lazily, emptyList())
    fun addPerson(name: String, age: Int) {
        viewModelScope.launch {
            repository.insert(Person(name = name, age = age))
        }
    }
}
