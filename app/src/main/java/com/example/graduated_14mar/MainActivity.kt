package com.example.graduated_14mar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
                    GreetingImage(
                        message = stringResource(R.string.happy_graduation_text),
                        from = stringResource(R.string.from_text),
                        modifier = Modifier.padding(6.dp),
                        harapan = stringResource(R.string.harapan_text),

                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, harapan: String, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Text(
                text = message,
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 80.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = harapan,
                fontSize = 25.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(25.dp)
            )
            Text(
                text = from,
                fontSize = 23.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(10.dp)
                    .align(alignment = Alignment.End)
            )

        }
    }
@Composable
fun GreetingImage(message: String, from: String, harapan: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.newbg)
    val tangan = painterResource(R.drawable.tangan)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.7F,
            contentScale = ContentScale.Crop
        )
        GreetingText(message = message,
            from = from,
            harapan = harapan ,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
        Column (
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = tangan,
                contentDescription = null,
                alpha = 0.1F,
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Graduated_14MarTheme {
        GreetingImage(
            message = stringResource(R.string.happy_graduation_text ),
            from = stringResource(R.string.from_text),
            harapan = stringResource(R.string.harapan_text)
        )
    }
}