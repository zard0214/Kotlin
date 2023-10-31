package cn.shef.msc5.todo.demos.ui.buttons

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
 * @date Created in 31/10/2023 11:56
 */
class ButtonsActivity : ComponentActivity() {
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
fun ElevatedButton() {

}

@Composable
fun FilledButton() {

}

@Composable
fun FilledTonalButton() {

}

@Composable
fun OutlinedButton() {

}

@Composable
fun TextButton() {

}

@Composable
fun IconButton() {

}

@Composable
fun SegmentedButton() {

}

@Composable
fun ExtendedFloatingActionButton() {

}



