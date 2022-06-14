package com.example.favoritecats.data.network

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient


@Serializable
data class CatData(
    val id: String,
    val url: String,
)


