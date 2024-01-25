package com.abdul.bhaiya.jetpackcomposedemo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdul.bhaiya.jetpackcomposedemo.R

@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    /* BlogCategory(
         img = R.drawable.abdul,
         title = "Programming",
         subTitle = "Learn Different Languages"
     )*/
    /*Column (modifier = Modifier.verticalScroll(rememberScrollState())){
        getCategoryList().map { item ->
            BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
        }
    }*/
    LazyColumn(content = {
        /* items(getCategoryList()){ item ->
             BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
         }*/
        items(getCategoryList()) { item ->
            BlogCategory(
                img = item.img,
                title = item.title,
                subTitle = item.subTitle
            )
        }
    })
}

@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {

    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = Modifier.padding(8.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f) //20%
            )
            //ItemDescription(title, subTitle, Modifier.weight(.8f)) //80%
            ItemDescription(
                title = title,
                subTitle = subTitle,
                modifier = Modifier.weight(.8f) //80%
            )
        }
    }
}

@Composable
private fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            //fontWeight = FontWeight.Bold
            style = MaterialTheme.typography.h6
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Thin
        )
    }
}

//Create a data class
data class Category(val img: Int, val title: String, val subTitle: String)

//Category List
fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(
        Category(
            R.drawable.abdul,
            "Programming",
            "Learn Different Programming"
        )
    )
    list.add(
        Category(
            R.drawable.ic_launcher_background,
            "Technology",
            "News about new Tech"
        )
    )
    list.add(
        Category(
            R.drawable.abdul,
            "Full Stack Development",
            "From Backend to Frontend"
        )
    )
    list.add(
        Category(
            R.drawable.ic_launcher_background,
            "DevOps",
            "Development CI, CD, etc,"
        )
    )
    list.add(
        Category(
            R.drawable.abdul,
            "AI & ML",
            "Basic Artificial Intelligence"
        )
    )

    //----------------------------------------------------------------------------------------------

    list.add(
        Category(
            R.drawable.abdul,
            "Programming",
            "Learn Different Programming"
        )
    )
    list.add(
        Category(
            R.drawable.ic_launcher_background,
            "Technology",
            "News about new Tech"
        )
    )
    list.add(
        Category(
            R.drawable.abdul,
            "Full Stack Development",
            "From Backend to Frontend"
        )
    )
    list.add(
        Category(
            R.drawable.ic_launcher_background,
            "DevOps",
            "Development CI, CD, etc,"
        )
    )
    list.add(
        Category(
            R.drawable.abdul,
            "AI & ML",
            "Basic Artificial Intelligence"
        )
    )

    //----------------------------------------------------------------------------------------------------

    list.add(
        Category(
            R.drawable.abdul,
            "Programming",
            "Learn Different Programming"
        )
    )
    list.add(
        Category(
            R.drawable.ic_launcher_background,
            "Technology",
            "News about new Tech"
        )
    )
    list.add(
        Category(
            R.drawable.abdul,
            "Full Stack Development",
            "From Backend to Frontend"
        )
    )
    list.add(
        Category(
            R.drawable.ic_launcher_background,
            "DevOps",
            "Development CI, CD, etc,"
        )
    )
    list.add(
        Category(
            R.drawable.abdul,
            "AI & ML",
            "Basic Artificial Intelligence"
        )
    )

    return list
}