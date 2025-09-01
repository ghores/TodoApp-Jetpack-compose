package com.example.noteapp.data.usecase

import com.example.noteapp.data.model.Note
import com.example.noteapp.data.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}