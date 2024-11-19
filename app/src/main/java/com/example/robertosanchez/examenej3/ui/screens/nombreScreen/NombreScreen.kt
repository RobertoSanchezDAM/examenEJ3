package com.example.robertosanchez.examenej3.ui.screens.nombreScreen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NombreScreen(navigateToDetalle: (String) -> Unit,  navigateBack: () -> Unit) {
    var mensaje by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Nombre Screen", fontSize = 30.sp)

        TextField(
            value = mensaje,
            onValueChange = { mensaje = it },
            label = { Text("Ingrese su nombre") },
            modifier = Modifier
               .padding(vertical = 16.dp)
               .fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(
            onClick = { navigateToDetalle(mensaje) }
        ) {
            Text("Login")
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Button(
            onClick = { navigateBack() },
        ) {
            Text("Ir hacia atras")
        }


    }
}