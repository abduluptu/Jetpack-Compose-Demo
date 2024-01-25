package com.abdul.bhaiya.jetpackcomposedemo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//remember, rememberSaveable
//Stateful Composable
@Preview
@Composable
fun NotificationScreen() {
    //share same state between two function (Called State Hoisting)
    /*var count: MutableState<Int> = remember {
        mutableStateOf(0)
    }*/

    var count: MutableState<Int> = rememberSaveable {
        mutableStateOf(0)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        
        NotificationCounter(count.value) {
            count.value++
        }

        MessageBar(count.value)
    }
}

//Stateless Composable
@Composable
fun NotificationCounter(count: Int, increment: () -> Unit) {
    val context = LocalContext.current
    //var count = 0
    /*var count: MutableState<Int> = rememberSaveable {
        mutableStateOf(0)
    }*/
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent ${count} notifications")
        Button(onClick = {
           increment()
        }) {
            Text(text = "Send notification")
        }
    }
}

//Stateless Composable
@Composable
fun MessageBar(count: Int) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = Icons.Default.Favorite,
                contentDescription = "",
                Modifier.padding(8.dp)
            )
            Text(text = "Messages sent so far - $count")
        }
    }
}

//Note: data comes from top to bottom (unidirectional flow),
// event go from bottom to top(unidirectional flow) like  click events.