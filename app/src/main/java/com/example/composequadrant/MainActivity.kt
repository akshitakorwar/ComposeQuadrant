package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuad()
                }
            }
        }
    }
}

@Composable
fun ComposeQuad() {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row() {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(0.5f)
                    .background(color = Color(0xFFEADDFF))) {

                Text(
                    text = "Text Composable",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.\n",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .fillMaxHeight(0.5f)
                    .background(color = Color(0xFFD0BCFF))) {

                Text(
                    text = "Image Composable",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)

                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        Row() {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
                    .background(color = Color(0xFFB69DF8))){

                Text(
                    text = "Row composable",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )

            }

            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))) {

                Text(
                    text = "Column composable",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ComposeQuadPreview() {
    ComposeQuadrantTheme {
        ComposeQuad()
    }
}