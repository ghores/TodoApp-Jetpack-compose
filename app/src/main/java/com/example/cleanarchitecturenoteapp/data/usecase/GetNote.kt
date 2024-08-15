package com.example.cleanarchitecturenoteapp.data.usecase

import com.example.cleanarchitecturenoteapp.data.model.Note
import com.example.cleanarchitecturenoteapp.data.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}