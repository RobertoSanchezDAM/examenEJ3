package com.example.robertosanchez.examenej3.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.robertosanchez.examenej3.ui.screens.detalleScreen.DetalleScreen
import com.example.robertosanchez.examenej3.ui.screens.homeScreen.HomeScreen
import com.example.robertosanchez.examenej3.ui.screens.nombreScreen.NombreScreen

@Composable
fun Navegacion() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen {
                navController.navigate(Nombre)
            }
        }

        composable<Nombre> {
            NombreScreen (
                navigateToDetalle = { mensaje ->
                    navController.navigate(Detalle(mensaje)) },
                navigateBack = { navController.popBackStack() }
            )
        }

        composable<Detalle> { backStatEntry ->
            val detalle = backStatEntry.toRoute<Detalle>()
            DetalleScreen(
                detalle.mensaje,
                { navController.popBackStack() },
                { navController.navigate(Home) }
            )

        }

    }
}





