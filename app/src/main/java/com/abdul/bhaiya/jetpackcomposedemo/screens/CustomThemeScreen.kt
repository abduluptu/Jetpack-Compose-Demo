package com.abdul.bhaiya.jetpackcomposedemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.abdul.bhaiya.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

@Composable
fun CustomAppTheme() {
    var theme = remember { mutableStateOf(false) }
    JetpackComposeDemoTheme(theme.value) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(1f)
                .background(MaterialTheme.colorScheme.background),
        ) {
            Button(onClick = {
                theme.value = !theme.value

            }) {
                Text(text = "Change Theme")
            }
        }
    }
}
