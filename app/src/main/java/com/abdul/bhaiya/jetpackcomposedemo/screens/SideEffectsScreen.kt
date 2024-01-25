package com.abdul.bhaiya.jetpackcomposedemo.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//Note: If you want to execute task only once or when the condition meets

var counter = 0

@Composable
fun HasSideEffect() {
    counter++
    Text(text = "Side Effects Example")
}


@Composable
fun ComposableList() {
    val categoryState = remember { mutableStateOf(emptyList<String>()) }
    // categoryState.value = fetchCategories()
    //Code will be execute on the basis of key1
    //Code will be execute 1 time only
    LaunchedEffect(key1 = Unit) {
        categoryState.value = fetchCategories()
    }


    LazyColumn {
        items(categoryState.value) { item ->
            Text(text = item)
        }
    }
}

fun fetchCategories(): List<String> {

    //assuming network call
    return listOf("One", "Two", "Three")
}

@Preview(showSystemUi = true)
@Composable
fun Counter() {
    val count = remember { mutableStateOf(0) }
    //Log.d("Counter", "Current count: ${count.value}")
    var key = count.value % 3 == 0
    LaunchedEffect(key1 = key){
        Log.d("Counter", "Current count: ${count.value}")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Button(onClick = { count.value++ }) {
            Text(text = "Increment count")
        }
    }
}