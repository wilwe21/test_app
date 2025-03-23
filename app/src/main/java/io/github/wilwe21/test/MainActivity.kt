package io.github.wilwe21.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.ReportDrawn
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.savedstate.SavedStateRegistry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bg = Color(24, 24, 37, 255)
        val fg = Color(205, 214, 244, 255)
        val accent = Color(203, 166, 247, 255)
        val spacing = 2.dp
        val borderSize = 3.dp
        val pad = 7.dp
        val radii = 7.dp
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color(0,0,0,0)) {
                Column {
                    Surface(color = accent) {
                        Surface(color = bg, modifier = Modifier.padding(borderSize)) {
                            Column {
                                var chuj = "Siema Chuju"
                                Button(onClick = {
                                    chuj = "Nie Klikaj mnie chuju"
                                }) {
                                    Text(text = chuj)
                                }
                                Greeting("Cwelu")
                                Greeting("Cymbale")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Siema $name!",
            modifier = modifier,
            color = Color(255,255,255)
    )
}