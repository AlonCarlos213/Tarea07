package com.example.ejercicio07

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio07.ui.theme.Ejercicio07Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio07Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Greeting(name = "Android")
                        MyButton()
                        MyText()
                        MyImage()
                        MyTextField()
                        MyRow()
                        MyColumn()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio07Theme {
        Greeting("Android")
    }
}


@Composable
fun MyButton() {
    Button(
        onClick = { /* Acción al hacer clic */ },
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Click Me")
    }
}

@Composable
fun MyText() {
    Text(
        text = "Hello, World!",
        fontSize = 24.sp,
        color = Color.Blue,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Sample Image",
        modifier = Modifier.size(100.dp)
    )
}

@Composable
fun MyTextField() {
    val textState = remember { TextFieldValue("Enter text here") }
    BasicTextField(
        value = textState,
        onValueChange = { /* Acción cuando cambia el texto */ },
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun MyRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text("Item 1")
        Text("Item 2")
        Text("Item 3")
    }
}

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Column Item 1")
        Text("Column Item 2")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponents() {
    Column {
        MyButton()
        MyText()
        MyImage()
        MyTextField()
        MyRow()
        MyColumn()
    }
}