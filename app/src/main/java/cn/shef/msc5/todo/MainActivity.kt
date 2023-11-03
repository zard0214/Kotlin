package cn.shef.msc5.todo

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import cn.shef.msc5.todo.base.BaseScaffold
import cn.shef.msc5.todo.base.BaseActivity
import cn.shef.msc5.todo.base.EmptyScreen
import cn.shef.msc5.todo.demos.ui.navigation.getIconForScreen
import cn.shef.msc5.todo.utilities.Constants.Companion.NAVIGATION_HOME
import cn.shef.msc5.todo.utilities.Constants.Companion.NAVIGATION_POST
import cn.shef.msc5.todo.utilities.Constants.Companion.NAVIGATION_PROFILE

/**
 * @author Zhecheng Zhao
 * @email zzhao84@sheffield.ac.uk
 * @date Created in 02/11/2023 06:45
 */
class MainActivity : BaseActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(this)
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        //TODO request permissions
        Log.d(TAG, "onStart: ")
    }

}

@Composable
fun MainScreen(mainActivity: MainActivity) {
    //get context
    val context = LocalContext.current
    val items = listOf(
        NAVIGATION_HOME,
        NAVIGATION_POST,
        NAVIGATION_PROFILE
    )
    var selectedItem by remember { mutableStateOf(items.first()) }
    BaseScaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(getIconForScreen(item), contentDescription = null) },
                        label = { Text(item) },
                        selected = item == selectedItem,
                        onClick = {
                            selectedItem = item
                        },
                        alwaysShowLabel = false
                    )
                }
            }
        }
    ) {
        when (selectedItem) {
            NAVIGATION_HOME -> EmptyScreen()
            NAVIGATION_POST -> EmptyScreen()
            NAVIGATION_PROFILE -> EmptyScreen()
        }
    }
}


@Preview(name = "Light theme")
@Preview(name = "Dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewMainScreen() {
    MainScreen(MainActivity())
}
