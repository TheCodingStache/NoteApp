package com.thecodingstache.noteapp.domain.use_case

import com.thecodingstache.noteapp.domain.InvalidNoteException
import com.thecodingstache.noteapp.domain.Note
import com.thecodingstache.noteapp.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note cannot be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note cannot be empty")
        }
        repository.insertNote(note)
    }
}