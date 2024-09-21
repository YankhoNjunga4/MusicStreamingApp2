package com.example.musicstreamingapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicstreamingapp.R
import com.example.musicstreamingapp.ui.theme.model.Albulm

@Composable
fun NavBar() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .height(50.dp)
                .fillMaxSize()
                .background(color = Color.LightGray)

        ) {
            Spacer(modifier = Modifier.width(10.dp))
            val PersonAcc = Image(
                painter = painterResource(id = R.drawable.account), contentDescription = null
            )
            Spacer(modifier = Modifier.width(140.dp))
            val AppLogo = Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(110.dp))
            val AppMenu = Image(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = null
            )
        }
    }
}


@Composable
fun BottomBar() {
    Column {
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier.padding(10.dp)){
            val searcher = Image(painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                modifier=Modifier.size(50.dp))
            OutlinedTextField(value = "search",
                onValueChange = { "search" },
                modifier = Modifier.weight(1f)
            )
        }

        Row {
            Spacer(modifier = Modifier.width(175.dp))
            val homei = Image(painter = painterResource(id = R.drawable.home),
                contentDescription = null, modifier=Modifier
                    .size(50.dp)
            )
        }
    }
}


@Composable
fun SongItem(album: Albulm) {
    Column(
        modifier = Modifier
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = album.albumCover),
            contentDescription = "Album Cover",
            modifier = Modifier.size(128.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = album.albumName.toString())
        Text(text = album.artistName.toString())
        Text(text = "${album.songsInAlbum} songs")
    }
}

