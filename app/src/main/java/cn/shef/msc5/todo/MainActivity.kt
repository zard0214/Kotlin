package cn.shef.msc5.todo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import cn.shef.msc5.todo.demos.NavigationBarActivity
import cn.shef.msc5.todo.ui.theme.TodoTheme

/**
 * @author Zhecheng Zhao
 * @registrationNo 220186627
 * @date Created in 31/10/2023 10:48
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen();
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    //get context
    val context = LocalContext.current
    Column {
        Button(onClick = {
            //jump to main activity
            context.startActivity(Intent(context, NavigationBarActivity::class.java))
//            startActivity(context, Intent(context, NavigationBarActivity::class.java), null)
        }) {
            Text("NavigationBar")
        }
    }
}

