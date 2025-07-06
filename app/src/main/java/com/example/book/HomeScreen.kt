package com.example.book

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black, titleContentColor = Color.White),
                title = {
                    Text("Little Lemon")
                },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Menu ICon")
                    }
                    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "little lemon logo")
                    IconButton(
                        onClick = {}
                    ) {
                        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Menu Icon")
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Cart Icon", tint = Color.White)
                    }
                }
            )
//            Row (
//                modifier = Modifier.fillMaxWidth().background(Color.Red),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                IconButton(
//                    onClick = {}
//                ) {
//                    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Menu ICon")
//                }
//                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "little lemon logo")
//                IconButton(
//                    onClick = {}
//                ) {
//                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Menu Icon")
//                }
//                IconButton(
//                    onClick = {}
//                ) {
//                    Icon(Icons.Default.ShoppingCart, contentDescription = "Cart Icon")
//                }
//            }
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .background(Color.Green)
        ) {
            Text("Home Screen")
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
