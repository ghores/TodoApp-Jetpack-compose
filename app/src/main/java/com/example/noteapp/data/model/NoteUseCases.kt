package com.example.noteapp.data.model

import com.example.noteapp.data.usecase.AddNote
import com.example.noteapp.data.usecase.DeleteNote
import com.example.noteapp.data.usecase.GetNote
import com.example.noteapp.data.usecase.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)