package com.example.robertosanchez.examenej3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.robertosanchez.examenej3.navegacion.Navegacion
import com.example.robertosanchez.examenej3.ui.theme.ExamenEJ3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEJ3Theme {
                Navegacion()
            }
        }
    }
}
