package com.abdul.bhaiya.jetpackcomposedemo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdul.bhaiya.jetpackcomposedemo.R

//@Preview(showBackground = true, widthDp = 300, heightDp = 500, showSystemUi = true)
@Composable
fun ModifierDemo() {
    Text(
        text = "Hello",
        color = Color.White,
        modifier = Modifier
            .clickable {

            }
            .background(Color.Blue)
            .size(200.dp)
            .padding(36.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            // .padding(16.dp)
            .background(Color.Yellow)
    )
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500, showSystemUi = true)
@Composable
fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.abdul),
        contentDescription = "Circular Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Cyan, CircleShape)
    )
}