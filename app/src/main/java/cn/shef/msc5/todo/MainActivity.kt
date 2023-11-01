package cn.shef.msc5.todo

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import cn.shef.msc5.todo.demos.ui.timepickers.TimePickersActivity

/**
 * @author Zhecheng Zhao
 * @registrationNo 220186627
 * @date Created in 31/10/2023 10:48
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
//                    TimePicker()
//                    DatePicker()
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
//            context.startActivity(Intent(context, NavigationBarActivity::class.java))
            startActivity(context, Intent(context, TimePickersActivity::class.java), null)
        }) {
            Text("NavigationBar")
        }
    }
}


@Preview(name = "Light theme")
@Preview(name = "Dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}

//@Preview
@Composable
fun OneLineListItem() {
    Column {
        ListItem(
            headlineContent = { Text("One line list item with 24x24 icon") },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            }
        )
        Divider()
    }
}

//@Preview
@Composable
fun TwoLineListItem() {
    Column {
        ListItem(
            headlineContent = { Text("Two line list item with trailing") },
            supportingContent = { Text("Secondary text") },
            trailingContent = { Text("meta") },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            }
        )
        Divider()
    }
}

//@Preview
@Composable
fun ThreeLineListItem() {
    Column {
        ListItem(
            headlineContent = { Text("Three line list item") },
            overlineContent = { Text("OVERLINE") },
            supportingContent = { Text("Secondary text") },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            },
            trailingContent = { Text("meta") }
        )
        Divider()
    }
}
