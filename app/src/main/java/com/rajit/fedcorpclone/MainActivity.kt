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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rajit.fedcorpclone.components.accountdetails.AccountDetails
import com.rajit.fedcorpclone.components.cardstatus.CardStatus
import com.rajit.fedcorpclone.components.fundtransfer.FundTransfer
import com.rajit.fedcorpclone.components.homepage.transactionapproval.TransactionApprovals
import com.rajit.fedcorpclone.components.homepage.useractions.UserActions
import com.rajit.fedcorpclone.components.knowtransactionlimit.KnowYourTransactionLimit
import com.rajit.fedcorpclone.components.ministatement.MiniStatement
import com.rajit.fedcorpclone.components.payeemanagement.addpayee.AddPayee
import com.rajit.fedcorpclone.components.payeemanagement.approvepayee.ApprovePayee
import com.rajit.fedcorpclone.components.payeemanagement.payeelist.PayeeList
import com.rajit.fedcorpclone.components.quickpay.QuickPay
import com.rajit.fedcorpclone.components.reporttransaction.ReportTransaction
import com.rajit.fedcorpclone.components.schedulepayment.SchedulePayment
import com.rajit.fedcorpclone.screen.Screen
import com.rajit.fedcorpclone.screen.Screens
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

                val navController = rememberNavController()

                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        ModalDrawerSheet {

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
                                title = {
                                    Text(
                                        text = "Welcome to FedCorp!",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    )
                                },
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

                            NavHost(
                                navController = navController,
                                startDestination = Screens.Home.route
                            ) {
                                composable(Screens.Home.route) {
                                    HomePageUI(

                                        onClickAccountDetails = {
                                            navController.navigate(Screens.AccountDetails.route)
                                        },

                                        onClickPayeeManagement = {
                                            navController.navigate(Screens.PayeeManagement.route)
                                        },
                                        onClickQuickPay = {
                                            navController.navigate(Screens.QuickPay.route)
                                        },
                                        onClickMiniStatement = {
                                            navController.navigate(Screens.MiniStatement.route)
                                        },
                                        onClickFundTransfer = {
                                            navController.navigate(Screens.FundTransfer.route)
                                        },
                                        onClickSchedulePayments = {
                                            navController.navigate(Screens.SchedulePayment.route)
                                        },
                                        onClickKnowTransactionLimits = {
                                            navController.navigate(Screens.KnowYourTransactionLimit.route)
                                        },
                                        onClickCardStatus = {
                                            navController.navigate(Screens.CardStatus.route)
                                        },
                                        onClickReportTransactions = {
                                            navController.navigate(Screens.ReportTransaction.route)
                                        },
                                    )
                                }

                                composable(Screens.AccountDetails.route) {
                                    AccountDetails()
                                }

                                composable(Screens.PayeeManagement.route) {
                                    PayeeList(
                                        onClickAddPayee = {
                                            navController.navigate(Screens.AddPayee.route)
                                        },
                                        onClickApprovePayee = {
                                            navController.navigate(Screens.ApprovePayee.route)
                                        }
                                    )
                                }

                                composable(Screens.AddPayee.route) {
                                    AddPayee()
                                }

                                composable(Screens.ApprovePayee.route) {
                                    ApprovePayee()
                                }

                                composable(Screens.QuickPay.route) {
                                    QuickPay()
                                }

                                composable(Screens.MiniStatement.route) {
                                    MiniStatement()
                                }

                                composable(Screens.FundTransfer.route) {
                                    FundTransfer()
                                }

                                composable(Screens.SchedulePayment.route) {
                                    SchedulePayment()
                                }

                                composable(Screens.KnowYourTransactionLimit.route) {
                                    KnowYourTransactionLimit()
                                }

                                composable(Screens.CardStatus.route) {
                                    CardStatus()
                                }

                                composable(Screens.ReportTransaction.route) {
                                    ReportTransaction()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePageUI(
    onClickAccountDetails: () -> Unit = {},
    onClickPayeeManagement: () -> Unit = {},
    onClickQuickPay: () -> Unit = {},
    onClickMiniStatement: () -> Unit = {},
    onClickFundTransfer: () -> Unit = {},
    onClickSchedulePayments: () -> Unit = {},
    onClickKnowTransactionLimits: () -> Unit = {},
    onClickCardStatus: () -> Unit = {},
    onClickReportTransactions: () -> Unit = {},
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Account Details Section
        AccountDetailsCard(onClickAccountDetailsCard = { onClickAccountDetails() })

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
            UserActions(
                onCLickAccountDetails = { onClickAccountDetails() },
                onClickPayeeManagement = { onClickPayeeManagement() },
                onClickQuickPay = { onClickQuickPay() },
                onClickMiniStatement = { onClickMiniStatement() },
                onClickFundTransfer = { onClickFundTransfer() },
                onClickSchedulePayments = { onClickSchedulePayments() },
                onClickKnowTransactionLimits = { onClickKnowTransactionLimits() },
                onClickCardStatus = { onClickCardStatus() },
                onClickReportTransactions = { onClickReportTransactions() }
            )
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