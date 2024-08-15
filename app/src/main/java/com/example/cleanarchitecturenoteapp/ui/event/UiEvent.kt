package com.example.cleanarchitecturenoteapp.ui.event

sealed class UiEvent {
    data class ShowSnackBar(val message: String): UiEvent()
    data object SaveNote: UiEvent()
}