package com.example.musicstreamingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicstreamingapp.ui.theme.model.Albulm
import com.example.musicstreamingapp.components.SongItem
import androidx.compose.ui.unit.dp
import com.example.musicstreamingapp.R
import com.example.musicstreamingapp.components.BottomBar
import com.example.musicstreamingapp.components.NavBar
import com.example.musicstreamingapp.components.SongItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { NavBar() },
        bottomBar = { BottomBar() }
    ) { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                LazyColumn {
                    val albums = listOf(
                        Albulm(
                            albumCover = R.drawable.founder,
                            artistName = R.string.Squamish,
                            albumName = R.string.found_her,
                            songsInAlbum = 10
                        ),
                        Albulm(
                            albumCover = R.drawable.founder,
                            artistName = R.string.Squamish,
                            albumName = R.string.found_her,
                            songsInAlbum = 10
                        ),
                    )

                    items(albums) { album ->
                        SongItem(album = album)
                    }
                }
            }
    }
}
@Preview (showBackground = true)
@Composable
fun PreviewHomeScreen(){
    HomeScreen()
}


        Text(text = "songTitle" , modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 20.sp)
        Row(
            modifier = Modifier
                .height(300.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.naruto),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

        }
        Row(modifier = Modifier.height(200.dp)) {
            Column(modifier = Modifier.width(108.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.aot),
                    contentDescription = null
                )

            }

            Column {
                Image(
                    painter = painterResource(id = R.drawable.ha),
                    contentDescription = null
                )

            }
            Image(
                painter = painterResource(id = R.drawable.miles),
                contentDescription = null
            )

        }
        Image(
            painter = painterResource(id = R.drawable.naruto),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column (modifier = Modifier
        .fillMaxWidth(1f)
        .background(color = Color.Black)){
        Spacer(modifier = Modifier.height(50.dp))
        Row (){
            val shuffle = Image(painter = painterResource(id = R.drawable.shuffle),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (){
            val previous = Image(painter = painterResource(id = R.drawable.previous),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (){
            val play = Image(painter = painterResource(id = R.drawable.play),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (){
            val next = Image(painter = painterResource(id = R.drawable.next),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row (){
            val artist = Image(painter = painterResource(id = R.drawable.artist),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row (){
            val like = Image(painter = painterResource(id = R.drawable.fav),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (){
            val addToPlay = Image(painter = painterResource(id = R.drawable.add),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (){
            val repeat = Image(painter = painterResource(id = R.drawable.repeat),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (){
            val queue = Image(painter = painterResource(id = R.drawable.queue),
                contentDescription = null)
        }

    }