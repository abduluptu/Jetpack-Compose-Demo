package com.abdul.bhaiya.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdul.bhaiya.jetpackcomposedemo.screens.AppRememberUpdateState
import com.abdul.bhaiya.jetpackcomposedemo.screens.Counters
import com.abdul.bhaiya.jetpackcomposedemo.screens.Derived
import com.abdul.bhaiya.jetpackcomposedemo.screens.KeyboardComposable
import com.abdul.bhaiya.jetpackcomposedemo.screens.Loader
import com.abdul.bhaiya.jetpackcomposedemo.screens.MediaDisComposable
import com.abdul.bhaiya.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Greeting("Android")
                   // SimpleRow()
                    //PreviewItem()
                   // NotificationScreen()
                   // HasSideEffect()
                   // Counter()
                    //LaunchEffectComposable()
                    //RememberUpdateState()
                    //AppRememberUpdateState()
                   // DisposableEffect()
                   // MediaDisComposable()
                    //KeyboardComposable()
                   // Counters()
                    //Loader()
                    Derived()
                }
            }

            //For Custom Theme
           // CustomAppTheme()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleRow() {
    /*Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Row Text 1", Modifier.background(Color.Red))
        Text(text = "Row Text 2", Modifier.background(Color.Green))
        Text(text = "Row Text3", Modifier.background(Color.Blue))
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Row Text 1", Modifier.background(Color.Red))
        Text(text = "Row Text 2", Modifier.background(Color.Green))
        Text(text = "Row Text3", Modifier.background(Color.Blue))
    }*/

    // Text in JetPack Compose
    /*Text(
        text = "Hello".repeat(50),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        fontSize = 20.sp,
        color = Color.Blue,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
    )*/

    // TextStyle in JetPack Compose
    /* Text(
         text = "Hello World",
         style = TextStyle(
             color = Color.Red,
             fontSize = 16.sp,
             fontFamily = FontFamily.Monospace,
             fontStyle = FontStyle.Italic,
             letterSpacing = 0.5.em,
             background = Color.LightGray,
             textDecoration = TextDecoration.Underline
         )
     )*/

    //9
    // TextField in Jetpack Compose
    /* var text by remember { mutableStateOf(TextFieldValue("")) }
     OutlinedTextField(
         value = text,*/

    //add an icon in the starting area
    /* leadingIcon = {
         Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon")
     },*/

    //add an icon in the ending area
    /*trailingIcon = {
        Icon(imageVector = Icons.Default.Add, contentDescription = null)
    },*/

    /* onValueChange = {
         text = it
     },
     label = { Text(text = "Email address") },
     placeholder = { Text(text = "Enter your e-mail") },*/
    // keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    //  )

    //10
    // LazyColumn and LazyRow
    /* LazyColumn{
         // Add a single item
         item{
             Text(text = "Header")
         }

         // Add 3 items
         items(120){ index ->
             Text(text = "First List items : $index")
         }

         // Add 2 items
         items(2) { index ->
             Text(text = "Second List Items: $index")
         }

         // Add a single item
         item{
             Text(text = "Footer")
         }
     }*/

    // Simple List
    /*val countryList = mutableListOf<String>("India", "Pakistan", "China", "United States")

    val listModifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan)
        .padding(16.dp)

    val textStyle = TextStyle(fontSize = 20.sp, color = Color.White)

    LazyColumn(modifier = listModifier){
        items(countryList){ country ->
            Text(text = country, style = textStyle)
        }
    }*/

    // Custom List
    /*val fruitsList = mutableListOf<FruitModel>()
    fruitsList.add(FruitModel("Apple", R.drawable.abdul))
    fruitsList.add(FruitModel("Orange", R.drawable.abdul))
    fruitsList.add(FruitModel("Banana", R.drawable.abdul))
    fruitsList.add(FruitModel("Strawberry", R.drawable.abdul))
    fruitsList.add(FruitModel("Mango", R.drawable.abdul))
    //---
    fruitsList.add(FruitModel("Apple", R.drawable.abdul))
    fruitsList.add(FruitModel("Orange", R.drawable.abdul))
    fruitsList.add(FruitModel("Banana", R.drawable.abdul))
    fruitsList.add(FruitModel("Strawberry", R.drawable.abdul))
    fruitsList.add(FruitModel("Mango", R.drawable.abdul))
    //----
    fruitsList.add(FruitModel("Apple", R.drawable.abdul))
    fruitsList.add(FruitModel("Orange", R.drawable.abdul))
    fruitsList.add(FruitModel("Banana", R.drawable.abdul))
    fruitsList.add(FruitModel("Strawberry", R.drawable.abdul))
    fruitsList.add(FruitModel("Mango", R.drawable.abdul))

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ){
        items(fruitsList){ model ->
            ListRow(model = model)
        }
    }*/

    //11
    //TopAppBar and Bottom Navigation with Scaffold
    // val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    /*Scaffold(
        topBar = {
            TopAppBar(
                title = {
                   // Text("Top App Bar")
                    Row() {
                        Text(
                            text = "Title 1",
                            fontSize = 30.sp,
                            color = Color.Red
                        )
                        Text(
                            text = "Title 2",
                            fontSize = 30.sp,
                            color = Color.White
                        )

                    }
                },
                navigationIcon = {
                    IconButton(onClick = { *//* Handle back action here *//* }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Cyan )
            )
        }
    ) { contentPadding ->
        // Screen content
        Text(text = "Jetpack Compose App Bar Example",
            modifier = Modifier.padding(contentPadding))
    }*/


    //12
    //Themes in Jetpack Compose
    // Text(text = "Custom", style = MaterialTheme.typography.title24sp)

    // 13. Card in Jetpack Compose
    /*val paddingModifier = Modifier.padding(10.dp)
    Card(
        //shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        border = BorderStroke(1.dp, Color.Cyan),
        modifier = paddingModifier
    ) {

        // Text(text = "Simple Card with elevation", modifier = paddingModifier)
        Column (modifier = paddingModifier){
            Text(text = "First Text", color = Color.Green)
            Text(text = "Second Text")
        }
    }*/

    //14. Jetpack Compose Progress Indicator (ProgressBar)
    //LinearProgressIndicator(progress = 0.75f)

    // Jetpack Compose Animations
    /*var isAnimated by remember { mutableStateOf(false) }

    val color = remember { Animatable(Color.DarkGray) }

    // animate to green/red based on `button click`
    LaunchedEffect(isAnimated) {
        color.animateTo(if (isAnimated) Color.Green else Color.Red, animationSpec = tween(2000))
    }

    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
            .background(color.value)
    )
    Button(
        onClick = { isAnimated = !isAnimated },
        modifier = Modifier.padding(top = 10.dp)
    ) {
        Text(text = "Animate Color")
    }*/

    // State Management in Jetpack Compose
    val context = LocalContext.current

    // var clickCount = 0
    //var clickCount by remember { mutableStateOf(0) }
    /*var clickCount = rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            clickCount.value++
           // Toast.makeText(context, "NoState: ${clickCount.value}", Toast.LENGTH_SHORT).show()

        }) {
            Text(text = "" + clickCount.value + " times clicked")
        }
    }*/

    /*Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }*/

    /* Row(
         modifier = Modifier.fillMaxSize(),
         horizontalArrangement = Arrangement.SpaceEvenly,
         verticalAlignment = Alignment.CenterVertically
     ) {
         Text(text = "A", fontSize = 24.sp)
         Text(text = "B", fontSize = 24.sp)
     }*/

    //Box -> Like a FrameLayout
    /*Box (
        contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = R.drawable.abdul), contentDescription = "")
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
    }*/

    //Modifier
    /*Text(
        text = "Hello",
        modifier = Modifier
            .clickable {  }
            .background(Color.Blue)
            .size(200.dp)
            //.padding(16.dp)
            .border(5.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)

        )*/

    /*Image(painter = painterResource(id = R.drawable.abdul),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Red, CircleShape),
        contentDescription = "")*/

}

@Composable
fun ListViewItem(imageId: Int, name: String, occupation: String) {
    Row (modifier = Modifier.padding(8.dp)){
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontWeight = FontWeight.Light, fontSize = 14.sp)
        }
    }
}

@Composable
fun CircleImage(imageSize: Dp) {
    Image(
        painter = painterResource(
            R.drawable.abdul

        ),
        contentDescription = "Circle Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(imageSize)
            .clip(CircleShape)
            .border(5.dp, Color.Gray, CircleShape)
    )
}

@Composable
fun BottomBar() {
    // Bottom Navigation
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {

        //0
        BottomNavigationItem(
            selected = selectedIndex.value == 0,
            onClick = {
                selectedIndex.value = 0
            },
            icon = {
                androidx.compose.material.Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = ""
                )

            },
            label = { Text(text = "Home") }
        )

        //1
        BottomNavigationItem(
            selected = selectedIndex.value == 1,
            onClick = {
                selectedIndex.value = 1
            },
            icon = {
                androidx.compose.material.Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = ""
                )

            },
            label = { Text(text = "Favorite") }
        )

        //2
        BottomNavigationItem(
            selected = selectedIndex.value == 2,
            onClick = {
                selectedIndex.value = 2
            },
            icon = {
                androidx.compose.material.Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = ""
                )

            },
            label = { Text(text = "Person") }
        )
    }
}

@Composable
fun ScaffoldWithBottomMenu() {

    /* Scaffold(bottomBar = {BottomBar()}
     ) {
         //content area
         Box(modifier = Modifier
             .background(Color.Cyan)
             .fillMaxSize())
     }*/

    Scaffold(
        bottomBar = { BottomBar() },
        content = { contentPadding ->
            // content area with padding
            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxSize()
                    .padding(contentPadding)
            )
        }
    )
}

@Composable
fun ListRow(model: FruitModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Cyan)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier

                .size(100.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            // modifier = Modifier.padding(20.dp)
        )
    }
}

data class FruitModel(val name: String, val image: Int)

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL)
@Composable
fun GreetingPreview() {
    JetpackComposeDemoTheme {
        // Greeting("Android")
        SimpleRow()
        // ScaffoldWithBottomMenu()

        /*Column {
            ListViewItem(R.drawable.abdul, "Abdul Khalid", "Software Engineer")
            ListViewItem(R.drawable.ic_launcher_background, "Abdul Khalid", "Mobile Developer")
            ListViewItem(R.drawable.abdul, "Azim", "Android Engineer")
            ListViewItem(R.drawable.ic_launcher_background, "Raja", "Python Developer")
            ListViewItem(R.drawable.abdul, "Soha", "Android Developer")
        }*/

    }
}