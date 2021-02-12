package com.samuelrmos.samplecompose.model

import com.samuelrmos.samplecompose.R

data class UserProfile(
    val name: String,
    val status: Boolean,
    val drawableId: Int
)

val userProfileList = arrayListOf(
    UserProfile(
        name = "Samuel Ramos",
        status = true,
        drawableId = R.drawable.download
    ),
    UserProfile(
        name = "Maria Paula",
        status = false,
        drawableId = R.drawable.images
    )
)