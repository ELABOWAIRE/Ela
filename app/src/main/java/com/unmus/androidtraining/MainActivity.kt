package com.unmus.androidtraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val user = User("Unmus", "Papua", 30)
            MenampilkanPesan(user)
        }
    }
}

data class User(
    val name: String,
    val address: String,
    val umur: Int
)

@Composable
fun MenampilkanPesan(user: User){
    Row() {
        Image(painter =
        painterResource(id = R.drawable.logo),
            contentDescription = "Uni musamus",
            modifier = Modifier
                // Set image size to 40 dp
                .size(100.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
        )
        Column() {
            Text(text = user.name)
            Text(text = user.umur.toString())
            Text(text = user.address)
        }
    }
}

@Preview
@Composable
fun PreviewMenampilkanPesan(){
    val user = User("Unmus", "Papua", 30)
    MenampilkanPesan(user)
}