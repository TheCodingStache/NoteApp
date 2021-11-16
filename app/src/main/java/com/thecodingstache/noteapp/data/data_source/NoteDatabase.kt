package com.thecodingstache.noteapp.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.thecodingstache.noteapp.domain.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao
}