package com.example.noteapp.data.usecase

import com.example.noteapp.data.model.Note
import com.example.noteapp.data.repository.NoteRepository
import com.example.noteapp.utils.InvalidNoteException

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}