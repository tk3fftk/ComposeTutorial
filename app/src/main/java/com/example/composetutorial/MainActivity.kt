package com.example.composetutorial

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    val image = painterResource(id = R.drawable.header)
    Column(
        modifier = Modifier.padding(all = 16.dp)
    ) {
        val imageModifier = Modifier
            .heightIn(min = 180.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(size = 4.dp))
        Image(painter = image, contentDescription = "", modifier = imageModifier, contentScale = ContentScale.Crop)

        Spacer(Modifier.size(size = 16.dp))
        Text("A day wandering through the sandhills " +
            "in Shark Fin Cove, and a few of the " + "sights I saw",
            maxLines = 2,
            style = typography.h6)
        Text("Devenport, Cali", style = typography.body2)
        Text("December 20109", style = typography.body2)
    }
}


@Preview
@Composable
fun DefaultPreview(){
    NewsStory()
}