package com.example.bmiwithvm
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bmiwithvm.ui.theme.BmiWithVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BmiWithVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BMIScreen()
                }
            }
        }
    }
}