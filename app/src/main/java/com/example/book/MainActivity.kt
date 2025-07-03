package com.example.book

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.book.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LittleLemonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HelloWorld(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HelloWorld(modifier: Modifier) {
    Column (
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xFF576861))
            .padding(start = 10.dp, top = 10.dp, end = 10.dp)
    ) {
        Text(stringResource(id = R.string.little_lemon),
            color = Color(0xFFF4CE14),
            fontSize = 32.sp
        )

        Text(stringResource(id = R.string.chicago), color = Color.White)

        Row (
            modifier = Modifier.padding(vertical = 20.dp)
        ) {
            Text(stringResource(
                id = R.string.family_owned_message),
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.width(200.dp)
            )

            Image(
                painter = painterResource(
                    id = R.drawable.little_lemon,
                ),
                // contentScale is VERY important
                contentScale = ContentScale.Crop,
                contentDescription = "little lemon image",
                modifier = Modifier.height(200.dp).clip(RoundedCornerShape(20.dp)),
            )
        }

        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14), contentColor = Color.Black)
        ) {
            Text("order")
        }
    }
}

@Preview
@Composable
fun HelloWorldPreview() {
    LittleLemonTheme {
        HelloWorld(modifier = Modifier.fillMaxSize())
    }
}