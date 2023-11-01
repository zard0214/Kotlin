package cn.shef.msc5.todo

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.WindowCompat
import cn.shef.msc5.todo.demos.ui.navigation.NavigationBarActivity
import cn.shef.msc5.todo.demos.ui.timepickers.TimePickersActivity

/**
 * @author Zhecheng Zhao
 * @registrationNo 220186627
 * @date Created in 31/10/2023 10:48
 */
class MainActivity : ComponentActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This app draws behind the system bars, so we want to handle fitting system windows
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, " onStart")
        //TODO request permissions

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
        }) {
            Text("NavigationBar")
        }
        Button(onClick = {
            //jump to main activity
            startActivity(context, Intent(context, TimePickersActivity::class.java), null)
        }) {
            Text("TimePicker")
        }
    }
}


@Preview(name = "Light theme")
@Preview(name = "Dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}
