package com.example.book.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.book.presentation.components.BookCard

@Composable
fun ListBooksScreen(modifier: Modifier) {
    LazyColumn (
        modifier = modifier.fillMaxSize().background(color = Color.White)
    ) {
       items(books) { book ->
           BookCard(book)
           Spacer(modifier = Modifier.height(10.dp))
       }
    }
}