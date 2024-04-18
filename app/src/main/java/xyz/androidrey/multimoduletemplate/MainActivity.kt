package xyz.androidrey.multimoduletemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.AppTheme
import com.example.compose.md_theme_light_primaryContainer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                AppTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = md_theme_light_primaryContainer
                    ) {
                        Text(text = "Hello Sabbir")
                    }
                }


        }
    }
}