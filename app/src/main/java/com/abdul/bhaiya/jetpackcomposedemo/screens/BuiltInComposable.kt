package com.abdul.bhaiya.jetpackcomposedemo.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.abdul.bhaiya.jetpackcomposedemo.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFunction() {

    /*Text(
        text = "Welcome to Jetpack Compose",
        fontWeight = FontWeight.Bold,
        color = Color.Cyan,
        fontSize = 24.sp,
        textAlign = TextAlign.Right
    )*/

    /*Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Dummy Image",
        colorFilter = ColorFilter.tint(Color.Cyan),
        contentScale = ContentScale.Crop
    )*/

    /* Button(
         onClick = {}, colors = ButtonDefaults.buttonColors(
             contentColor = Color.White
         ), enabled = false
     ) {
         Text(text = "Hello")
         Image(
             painter = painterResource(id = R.drawable.ic_launcher_background),
             contentDescription = "Dummy"
         )
     }*/

}

@Preview(showSystemUi = true)
@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") }
    TextField(value = state.value, onValueChange = {
        state.value = it
    },
        label = { Text(text = "Enter message ") },
        placeholder = {})
}