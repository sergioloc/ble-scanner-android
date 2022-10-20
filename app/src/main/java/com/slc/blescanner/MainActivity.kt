package com.slc.blescanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Header("Buscando señal BLC...")
        }
    }
}

@Composable
fun Header(text: String) {
    Text(text)
}

@Preview(showSystemUi = true)
@Composable
fun Screen() {
    Header("Buscando señal BLC...")
}