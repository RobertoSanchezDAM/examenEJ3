package com.example.robertosanchez.examenej3.ui.screens.detalleScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetalleScreen(mensaje: String, navigateBack: () -> Unit, navigateToHome: () -> Unit) {
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Mensaje:", fontSize = 40.sp, fontStyle = FontStyle.Italic)

        Spacer(modifier = Modifier.padding(10.dp))

        Text(text = "$mensaje", fontSize = 25.sp)

        Spacer(modifier = Modifier.padding(16.dp))

        Button (
            onClick = { navigateBack() },
        ) {
            Text("Ir hacia atras")
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Button (
            onClick = { navigateToHome() },
        ) {
            Text("Ir a Home Screen")
        }
    }

}
