package com.example.birthdayapp_s385550.repositories

import com.example.birthdayapp_s385550.data.Person
import com.example.birthdayapp_s385550.data.PersonDao
import kotlinx.coroutines.flow.Flow

class PersonRepository(private val dao: PersonDao){
    val allPersons: Flow<List<Person>> = dao.getAllPersons()
    suspend fun insert(person: Person){
        dao.insert(person)
    }

    init {
        val personliste =hentPersoner()
    }
    fun hentPersoner():List<Person>{
        val personer = mutableListOf<Person>()
        for (i in 1..100){
            val person = Person("Person $i", i)
            personer.add(person)
        }
        return personer
        }

    }
