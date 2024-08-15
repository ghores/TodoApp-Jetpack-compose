package com.example.cleanarchitecturenoteapp.ui.state

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)