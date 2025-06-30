package com.example.book.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.book.presentation.BookVM

@Composable
fun BookCard(book: BookVM) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black)
            .padding(8.dp)
    ) {
        Text(book.author, color = Color.White)
        Text(book.title, color = Color.White)
    }
}