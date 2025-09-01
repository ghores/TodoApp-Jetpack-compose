package com.example.noteapp.data.usecase

import com.example.noteapp.data.model.Note
import com.example.noteapp.data.repository.NoteRepository


class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}