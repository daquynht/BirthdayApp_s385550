package com.example.birthdayapp_s385550.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonDao {
    @Insert
    suspend fun insert(person: Person)

    @Query("SELECT * FROM person_table ORDER BY id DESC")
    fun getAllPersons(): Flow<List<Person>>
}