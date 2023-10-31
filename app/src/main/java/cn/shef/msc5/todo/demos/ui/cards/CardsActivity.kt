package cn.shef.msc5.todo.demos.ui.cards;

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * @author Zhecheng Zhao
 * @registrationNo 220186627
 * @date Created in 31/10/2023 15:38
 */
class CardsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}


@Composable
fun ElevatedCard() {

}

@Composable
fun FilledCard() {

}

@Composable
fun OutlinedCard() {

}