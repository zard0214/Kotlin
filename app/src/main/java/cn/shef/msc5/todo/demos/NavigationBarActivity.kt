package cn.shef.msc5.todo.demos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import cn.shef.msc5.todo.ui.theme.TodoTheme
import cn.shef.msc5.todo.utilities.NAVIGATION_HOME
import cn.shef.msc5.todo.utilities.NAVIGATION_POST
import cn.shef.msc5.todo.utilities.NAVIGATION_PROFILE


/**
 * @author Zhecheng Zhao
 * @registrationNo 220186627
 * @date Created in 31/10/2023 11:56
 */
class NavigationBarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomNavigation()
                    NavigationBarWithOnlySelected()
                }
            }
        }
    }
}

@Composable
fun BottomNavigation() {

    val items = listOf(NAVIGATION_HOME, NAVIGATION_POST, NAVIGATION_PROFILE)
    var selectedItem by remember { mutableStateOf(items.first()) }

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(getIconForScreen(item), contentDescription = null) },
                label = { Text(item) },
                selected = selectedItem == item,
                onClick = { selectedItem = item }
            )
        }
    }

}


@Composable
fun NavigationBarWithOnlySelected() {

    val items = listOf(NAVIGATION_HOME, NAVIGATION_POST, NAVIGATION_PROFILE)
    var selectedItem by remember { mutableStateOf(items.first()) }

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(getIconForScreen(item), contentDescription = null) },
                label = { Text(item) },
                selected = item == selectedItem,
                onClick = { selectedItem = item },
                alwaysShowLabel = false
            )
        }
    }
}

@Composable
fun getIconForScreen(items: String): ImageVector {
    return when (items) {
        NAVIGATION_HOME -> Icons.Default.Home
        NAVIGATION_POST -> Icons.Default.Add
        NAVIGATION_PROFILE -> Icons.Default.Person
        else -> Icons.Default.Home
    }
}