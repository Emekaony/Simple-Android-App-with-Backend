package com.example.firstapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.svg.SvgDecoder
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAppTheme {
                Scaffold { innerPadding ->
                    TextComposable(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TextEntryComposable(modifier: Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember {mutableStateOf("")}

    val message = stringResource(R.string.message_text, email, password)

    Column (
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = {
                Text("Enter your email...")
            },
            label = {
              Text("Email")
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = {
                Text("Enter your password...")
            },
            label = {
                Text("Password")
            }
        )

        Spacer(Modifier.height(10.dp))

        // show a toast method
        val context = LocalContext.current

        // get access to the keyboard
        var keyboard = LocalSoftwareKeyboardController.current

        Button(
            onClick = {
                // hide the keyboard if it's open so it doesn't
                // obstruct the toast message
                keyboard?.hide()

                // toast is a way of showing messages to users
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                Log.d("LoginCredentials", message)
            }
        ) {
            Text("Login")
        }
    }
}

//@Preview
//@Composable
//fun TextEntryPreview() {
//    TextEntryComposable(Modifier)
//}

@Composable
fun TextComposable(modifier: Modifier) {
    var checked by remember { mutableStateOf(false) }
    val models = listOf(
        "https://api.dicebear.com/8.x/bottts/svg?seed=Bubba",
        "https://api.dicebear.com/8.x/bottts/svg?seed=Bear"
    )
    
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Switch(checked = checked, onCheckedChange = { checked = !checked })
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(if (checked) models[0] else models[1])
                .decoderFactory(SvgDecoder.Factory())
                .build(),
            contentDescription = "exercise image"
        )
    }
}

@Preview
@Composable
fun TextComposePreview() {
    TextComposable(Modifier)
}