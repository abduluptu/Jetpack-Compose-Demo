package com.abdul.bhaiya.jetpackcomposedemo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdul.bhaiya.jetpackcomposedemo.R

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun FunctionPreview() {

    /*Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }*/

    /*Row (
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }*/

    // Box is like a Framelayout
    /*Box(
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.heart_broken),
            contentDescription = "Heart Image"
        )
        Image(
            painter = painterResource(id = R.drawable.arrow_outward),
            contentDescription = "Arrow Image"
        )
    }*/

    //ListViewItem(R.drawable.abdul, "Abdul Khalid", "Software Engineer")
    Column {
        ListViewItem(R.drawable.abdul, "Abdul Khalid", "Software Engineer")
        ListViewItem(R.drawable.ic_launcher_background, "Deepa Singhal", "Technical Lead")
        ListViewItem(R.drawable.abdul, "Deepu Verma", "Lead Engineer")
        ListViewItem(R.drawable.ic_launcher_background, "Tarique Anwar", "Software Developer")
        ListViewItem(R.drawable.abdul, "Suheb Khan", "Software Engineer")
    }
}

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            modifier = Modifier
                .size(40.dp)

        )
        Column() {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}