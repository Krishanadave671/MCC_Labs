package com.Krishana.MCClabs


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.Krishana.MCClabs.ui.theme.MCClabsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MCClabsTheme {
                    MyCanvas()
                }
            }
        }
    }

@Composable
fun MyCanvas() {
    Column {
        Row {
            Canvas(
                modifier = Modifier
                    .padding(20.dp)
                    .size(100.dp),
                onDraw = {
                    drawRect(color = Color.Blue)
                }
            )
            Text(text = "Square" , style = MaterialTheme.typography.headlineMedium, color = Color.Blue, modifier = Modifier.padding(40.dp))
            
        }
        Row {
            Canvas(
                modifier = Modifier
                    .padding(20.dp)
                    .size(100.dp),
                onDraw = {
                    drawCircle(color = Color.Blue)
                }
            )
            Text(text = "Circle" , style = MaterialTheme.typography.headlineMedium, color = Color.Blue, modifier = Modifier.padding(40.dp))

        }
        Row {
            Canvas(
                modifier = Modifier
                    .padding(20.dp)
                    .size(100.dp),
                onDraw = {
                    drawLine(
                        color = Color.Blue,
                        start = Offset(0f + 50f + 10f, 200f ),
                        end = Offset(200f + 50f + 10f, 0f),
                        strokeWidth = 10f
                    )
                }
            )
            Text(text = "Line" , style = MaterialTheme.typography.headlineMedium, color = Color.Blue, modifier = Modifier.padding(40.dp))

        }
        Row {
            Canvas(
                modifier = Modifier
                    .padding(20.dp)
                    .size(100.dp, 200.dp),
                onDraw = {
                    drawRect(
                        color = Color.Blue,
                        size = size
                    )
                }
            )
            Text(text = "Rectangle " , style = MaterialTheme.typography.headlineMedium, color = Color.Blue, modifier = Modifier.padding(40.dp))

        }
    }
}

