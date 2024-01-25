package com.abdul.bhaiya.jetpackcomposedemo.screens

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun TextInputDemo() {

    val state = remember { mutableStateOf("") }

    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = {
            Text(text = "Enter your message: ")
        },
        placeholder = {
            Text(text = "Your name: ")
        }
    )
}

