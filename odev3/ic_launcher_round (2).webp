package eu.tutorials.odev3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import eu.tutorials.odev3.ui.theme.Odev3Theme
import coil.compose.AsyncImage
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Odev3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
                   ProfileScreen(
                       modifier = Modifier.padding(paddingValues)
                   )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier){
    val skills = listOf(
        "Kotlin",
        "Jetpack Compose",
        "Python"
    )
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Avatar",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text= "Enise Karadağ"
        )
        Text(text="İstanbul Sabahattin Zaim Üniversitesi")
        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ){
            items(skills){skill ->
                Card(modifier = Modifier.fillMaxWidth().padding(4.dp)){
                    Text(
                        text = skill

                    )
                }
            }
        }

    }
}