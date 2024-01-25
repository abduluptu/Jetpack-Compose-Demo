package com.abdul.bhaiya.jetpackcomposedemo.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

//@Preview(showSystemUi = true)
@Composable
fun RememberUpdateState() {
    var counter = remember { mutableStateOf(0) }

    LaunchedEffect(key1 = Unit) {
        delay(2000) //2 seconds
        counter.value = 10
    }
    Counter(counter.value)
}

@Composable
fun Counter(value: Int) {
    val state = rememberUpdatedState(newValue = value)

    LaunchedEffect(key1 = Unit) {
        delay(5000) //5 seconds
        Log.d("ABDUL", state.value.toString())
    }
    Text(text = value.toString())
}

//--------------------------------------------------------------------------------------------------

fun a(){
    Log.d("ABDUL", "I am A from App")
}
fun b(){
    Log.d("ABDUL", "I am B from App")
}

@Preview(showSystemUi = true)
@Composable
fun AppRememberUpdateState() {
    var state = remember { mutableStateOf(::a) }

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ){
        Button(onClick = { state.value = ::b }) {
            Text(text = "Click to change state")
        }
    }

    LandingScreen (state.value)
}

//Splash Screen
@Composable
fun LandingScreen(onTimeout: () -> Unit) {
    val currentOnTimeout by rememberUpdatedState(onTimeout)

    LaunchedEffect(key1 = true ){
        delay(5000)
        currentOnTimeout()
    }
}