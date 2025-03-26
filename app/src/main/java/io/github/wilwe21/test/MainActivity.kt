package io.github.wilwe21.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    val bg = Color(24, 24, 37, 255)
    val fg = Color(205, 214, 244, 255)
    val accent = Color(203, 166, 247, 255)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = bg
            ) {
                Column {
                    Greeting("Chuju", fg)
                    Tx("Ci", accent)
                    Tx("w", fg)
                    Tx("Dupe", accent)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, color: Color, modifier: Modifier = Modifier) {
    Text(
        text = "Siema $name!",
        color = color,
        modifier = modifier
    )
}
@Composable
fun Tx(name: String, color: Color, modifier: Modifier = Modifier) {
    Text(
        text = "$name!",
        color = color,
        modifier = modifier
    )
}
