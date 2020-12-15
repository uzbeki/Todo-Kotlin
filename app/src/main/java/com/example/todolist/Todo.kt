package com.example.todolist

//data todo class that holds todo items
data class Todo(
    val title: String,
    var isChecked: Boolean = false
)