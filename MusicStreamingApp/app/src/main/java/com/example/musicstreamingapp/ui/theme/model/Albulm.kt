package com.example.musicstreamingapp.ui.theme.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Albulm(
    @DrawableRes val albumCover: Int,
    @StringRes val artistName: Int,
    @StringRes val albumName: Int,
    val songsInAlbum: Int
    )
