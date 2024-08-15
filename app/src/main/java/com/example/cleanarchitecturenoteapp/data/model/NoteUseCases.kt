package com.example.cleanarchitecturenoteapp.data.model

import com.example.cleanarchitecturenoteapp.data.usecase.AddNote
import com.example.cleanarchitecturenoteapp.data.usecase.DeleteNote
import com.example.cleanarchitecturenoteapp.data.usecase.GetNote
import com.example.cleanarchitecturenoteapp.data.usecase.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)