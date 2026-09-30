package com.example.mybottomnavigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mybottomnavigationcompose.ui.screen.MainScreen
import com.example.mybottomnavigationcompose.ui.theme.MyBottomNavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyBottomNavigationComposeTheme {
                MainScreen()
            }
        }
    }
}
