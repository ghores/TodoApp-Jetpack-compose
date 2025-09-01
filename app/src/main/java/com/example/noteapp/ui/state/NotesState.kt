package com.example.noteapp.ui.state

import com.example.noteapp.data.model.Note
import com.example.noteapp.utils.NoteOrder
import com.example.noteapp.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)