package com.example.cleanarchitecturenoteapp.utils

sealed class OrderType {
    data object Ascending: OrderType()
    data object Descending: OrderType()
}