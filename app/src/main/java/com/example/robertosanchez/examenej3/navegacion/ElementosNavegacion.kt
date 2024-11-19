package com.example.robertosanchez.examenej3.navegacion

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Nombre

@Serializable
data class Detalle(val mensaje: String)