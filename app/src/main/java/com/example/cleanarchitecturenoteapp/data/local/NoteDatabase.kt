package com.example.cleanarchitecturenoteapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cleanarchitecturenoteapp.data.model.Note


@Database(
    entities = [Note::class], version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao
}