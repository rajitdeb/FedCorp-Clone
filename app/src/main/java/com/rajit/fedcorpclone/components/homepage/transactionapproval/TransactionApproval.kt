package com.rajit.fedcorpclone.components.homepage.transactionapproval

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rajit.fedcorpclone.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun TransactionApprovals(
    onClick: () -> Unit = { /* DEFAULT onClick() */ }
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.lightFadedGreen)
        ),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text("Transaction Approvals", color = Color.Black)

            Icon(
                painter = painterResource(id = R.drawable.ic_next),
                tint = Color.DarkGray,
                contentDescription = "Go to Transaction Approvals Page"
            )

        }
    }
}