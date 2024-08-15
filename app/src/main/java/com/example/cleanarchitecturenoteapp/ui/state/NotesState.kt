package com.example.cleanarchitecturenoteapp.ui.state

import com.example.cleanarchitecturenoteapp.data.model.Note
import com.example.cleanarchitecturenoteapp.utils.NoteOrder
import com.example.cleanarchitecturenoteapp.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)