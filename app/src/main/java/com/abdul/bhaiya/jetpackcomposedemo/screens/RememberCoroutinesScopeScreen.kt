package com.abdul.bhaiya.jetpackcomposedemo.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Preview(showSystemUi = true)
@Composable
fun LaunchEffectComposable() {
    /* val counter = remember { mutableStateOf(0) }
     var scope = rememberCoroutineScope()

     LaunchedEffect(key1 = Unit) {
         Log.d("LaunchEffectComposable", "Started...")
         try {
             for (i in 1..10) {
                 counter.value++
                 delay(1000) //1 second
             }

         } catch (e: Exception) {
             Log.d("LaunchEffectComposable", "Exception:  ${e.message.toString()}")
         }
     }*/  // LaunchedEffect Ends


    /* var text = "Counter is running: ${counter.value}"
     if (counter.value == 10) {
         text = "Counter stopped"
     }
     Column(
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally,
         modifier = Modifier.fillMaxSize(1f)
     ) {
         Text(
             text = text,
             fontWeight = FontWeight.Bold,
             fontSize = 24.sp
         )
     }*/

    //Second Way
    val counter = remember { mutableStateOf(0) }
    var scope = rememberCoroutineScope()

    var text = "Counter is running: ${counter.value}"
    if (counter.value == 10) {
        text = "Counter stopped"
    }
    Column {
        Text(text = text)
        Button(onClick = {
            scope.launch {

                Log.d("LaunchEffectComposable", "Started...")
                try {
                    for (i in 1..10) {
                        counter.value++
                        delay(1000) //1 second
                    }

                } catch (e: Exception) {
                    Log.d("LaunchEffectComposable", "Exception:  ${e.message.toString()}")
                }
            }
        }) {
            Text(text = "Start")
        }
    }
}