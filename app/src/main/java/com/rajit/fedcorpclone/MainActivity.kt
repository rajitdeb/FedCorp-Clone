package com.rajit.fedcorpclone

import AccountDetailsCard
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rajit.fedcorpclone.components.homepage.transactionapproval.TransactionApprovals
import com.rajit.fedcorpclone.components.homepage.useractions.UserActions
import com.rajit.fedcorpclone.components.payeemanagement.payeelist.PayeeList
import com.rajit.fedcorpclone.screen.Screen
import com.rajit.fedcorpclone.ui.theme.DarkBlue
import com.rajit.fedcorpclone.ui.theme.FedCorpCloneTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FedCorpCloneTheme {

                val scope = rememberCoroutineScope()
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val selectedItem = rememberSaveable { mutableStateOf(Screen.HOME) }

                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        ModalDrawerSheet(
                        ) {

                            NavigationDrawerItem(
                                label = { Text("Home") },
                                selected = selectedItem.value == Screen.HOME,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.HOME
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_home),
                                        contentDescription = "Home Button"
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("Add External User") },
                                selected = selectedItem.value == Screen.ADD_EXTERNAL_USER,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.ADD_EXTERNAL_USER
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_payee_add),
                                        contentDescription = "Add External User Button"
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("One Touch Call") },
                                selected = selectedItem.value == Screen.ONE_TOUCH_CALL,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.ONE_TOUCH_CALL
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_call),
                                        contentDescription = "One Touch Call Button"
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("Settings") },
                                selected = selectedItem.value == Screen.SETTINGS,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.SETTINGS
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_settings),
                                        contentDescription = "Settings Button",
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("Forgot Web Password") },
                                selected = selectedItem.value == Screen.FORGOT_WEB_PASSWORD,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.FORGOT_WEB_PASSWORD
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_web_password),
                                        contentDescription = "Forgot Web Password Button",
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("Grievance Redressal") },
                                selected = selectedItem.value == Screen.GRIEVANCE_REDRESSAL,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.GRIEVANCE_REDRESSAL
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_grievance),
                                        contentDescription = "Grievance Redressal Button",
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("Safe and Secured Usage Guidelines") },
                                selected = selectedItem.value == Screen.SECURE_SAFE_USAGE_GUIDELINES,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.SECURE_SAFE_USAGE_GUIDELINES
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_safe_guidelines),
                                        contentDescription = "Safe and Secured Usage Guidelines Button",
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("FAQ") },
                                selected = selectedItem.value == Screen.FAQ,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.FAQ
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_faq),
                                        contentDescription = "Frequently Asked Questions Button",
                                    )
                                }
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            NavigationDrawerItem(
                                label = { Text("Log Out") },
                                selected = selectedItem.value == Screen.LOG_OUT,
                                onClick = {
                                    scope.launch {
                                        selectedItem.value = Screen.LOG_OUT
                                        Log.d(
                                            "NavigationDrawer",
                                            "HomePageUI: selectedItem: ${selectedItem.value}"
                                        )
                                        drawerState.close()
                                    }
                                },
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .fillMaxWidth(0.9f),
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.ic_logout),
                                        contentDescription = "Log Out Button"
                                    )
                                }
                            )

                        }
                    },
                    gesturesEnabled = true
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = { Text("Welcome to FedCorp!") },
                                actions = {
                                    IconButton(onClick = {
                                        scope.launch {
                                            drawerState.apply {
                                                if (isClosed) open() else close()
                                            }
                                        }
                                    }) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_menu),
                                            contentDescription = null,
                                        )
                                    }
                                },
                                colors = TopAppBarDefaults.topAppBarColors(
                                    containerColor = DarkBlue,
                                    titleContentColor = Color.White,
                                    navigationIconContentColor = Color.White,
                                    actionIconContentColor = Color.White
                                )
                            )
                        }
                    ) { contentPadding ->

                        Column(modifier = Modifier.padding(contentPadding)) {
                            ShowScreenContent(selectedItem.value)
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun ShowScreenContent(value: String) {
        return when(value) {
            "Home" -> HomePageUI()
            else -> PayeeList()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePageUI(navController: NavHostController = rememberNavController()) {
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Account Details Section
        AccountDetailsCard()

        // User Actions - Icons
        Text(
            "User Actions",
            style = TextStyle(
                color = Color.White,
                fontSize = 16.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
                .background(
                    color = colorResource(id = R.color.orange),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(12.dp)
        )

        Card(
            colors = CardDefaults.cardColors(containerColor = DarkBlue)
        ) {
            UserActions()
        }

        Column(
            modifier = Modifier.padding(vertical = 10.dp),
        ) {

            val context = LocalContext.current

            // Transaction Approvals - UI
            TransactionApprovals(onClick = {
                Toast.makeText(context, "No approvals found", Toast.LENGTH_SHORT).show()
            })
        }
    }
}