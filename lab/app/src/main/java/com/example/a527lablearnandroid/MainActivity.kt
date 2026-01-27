package com.example.a527lablearnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a527lablearnandroid.ui.theme._527LabLearnAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _527LabLearnAndroidTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(32.dp)
    ) {

        // HP Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp)
                .background(Color.White)
                .padding(4.dp)
        ) {
            Text(
                text = "HP",
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .fillMaxWidth(0.5f)
                    .background(Color.Red)
                    .padding(8.dp),
                color = Color.White
            )
        }

        // image (เอาไว้ต่อ)
        Spacer(modifier = Modifier.height(16.dp))

        // status (เอาไว้ต่อ)
        Text(text = "Status", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    _527LabLearnAndroidTheme {
        MainScreen()
    }
}
