package com.example.cleanarchitecturenoteapp.ui.event

import com.example.cleanarchitecturenoteapp.data.model.Note
import com.example.cleanarchitecturenoteapp.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    data object RestoreNote: NotesEvent()
    data object ToggleOrderSection: NotesEvent()
}