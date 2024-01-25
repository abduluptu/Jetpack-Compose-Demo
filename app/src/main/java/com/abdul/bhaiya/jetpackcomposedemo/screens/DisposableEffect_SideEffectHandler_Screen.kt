package com.abdul.bhaiya.jetpackcomposedemo.screens

import android.media.MediaPlayer
import android.util.Log
import android.view.ViewTreeObserver
import android.view.WindowInsets
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.abdul.bhaiya.jetpackcomposedemo.R

//1 Example
@Preview(showSystemUi = true)
@Composable
fun DisposableEffect() {

    var state = remember { mutableStateOf(false) }

    DisposableEffect(key1 = state.value) {
        Log.d("ABDUL", "Disposable Effect Started")
        onDispose {
            // write cleanup  code
            Log.d("ABDUL", "Cleaning up side effects")
        }
    }

    Button(onClick = { state.value = !state.value }) {
        Text(text = "Change State")
    }
}

//2 Example
@Composable
fun MediaDisComposable() {
    val context = LocalContext.current

    DisposableEffect(Unit) {
        val mediaPlayer = MediaPlayer.create(context, R.raw.ishk_jaisa)
        mediaPlayer.start()

        onDispose {
            mediaPlayer.stop()
            mediaPlayer.release()
        }
    }
}

//3 Example
@Composable
fun KeyboardComposable() {
    val view = LocalView.current

    DisposableEffect(key1 = Unit) {
        val listener = ViewTreeObserver.OnGlobalLayoutListener {
            //get rectangle inside the view
            val insets = ViewCompat.getRootWindowInsets(view)
            val isKeyboardVisible = insets?.isVisible(WindowInsetsCompat.Type.ime())
            Log.d("ABDUL", isKeyboardVisible.toString())
        }
        view.viewTreeObserver.addOnGlobalLayoutListener(listener)

        onDispose {
            view.viewTreeObserver.removeOnGlobalLayoutListener(listener)
        }
    }
}