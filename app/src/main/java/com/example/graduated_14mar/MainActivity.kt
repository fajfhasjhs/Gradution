package com.example.graduated_14mar

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduated_14mar.ui.theme.Graduated_14MarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Graduated_14MarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Happy Graduation Anne!",
                        from = "From Fais",
                        modifier = Modifier.padding(8.dp),
                        harapan = "Your life is your story, and the adventure ahead of you is the journey to fulfill your own purpose and potential.")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, harapan: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Yellow) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Text(
                text = message,
                fontSize = 75.sp,
                lineHeight = 90.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = harapan,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = from,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(20.dp)
                    .align(alignment = Alignment.End)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Graduated_14MarTheme {
        GreetingText(message = "Happy Graduation Anne!",
        from = "From Fais", harapan = "Your life is your story, and the adventure ahead of you is the journey to fulfill your own purpose and potential.")
    }
}