package com.rajit.fedcorpclone

import AccountDetailsCard
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.rajit.fedcorpclone.components.homepage.transactionapproval.TransactionApprovals
import com.rajit.fedcorpclone.components.homepage.useractions.UserActions
import com.rajit.fedcorpclone.ui.theme.DarkBlue
import com.rajit.fedcorpclone.ui.theme.FedCorpCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FedCorpCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePageUI()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePageUI() {

    Column {

        // Navigation Drawer Icon
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(DarkBlue)
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                "Welcome to FedCorp!",
                style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )

            IconButton(
                onClick = { /* TODO() */ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu),
                    tint = Color.White,
                    contentDescription = ""
                )
            }
        }

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

}