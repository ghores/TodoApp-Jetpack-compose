package com.example.noteapp.utils

sealed class OrderType {
    data object Ascending: OrderType()
    data object Descending: OrderType()
}