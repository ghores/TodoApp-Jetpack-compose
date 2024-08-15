package com.example.cleanarchitecturenoteapp.data.usecase

import com.example.cleanarchitecturenoteapp.data.model.Note
import com.example.cleanarchitecturenoteapp.data.repository.NoteRepository


class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}