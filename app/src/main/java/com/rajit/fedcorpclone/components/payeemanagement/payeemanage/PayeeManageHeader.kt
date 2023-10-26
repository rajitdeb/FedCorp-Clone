package com.rajit.fedcorpclone.components.payeemanagement.payeemanage

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rajit.fedcorpclone.R
import com.rajit.fedcorpclone.ui.theme.DarkBlue
import com.rajit.fedcorpclone.ui.theme.Orange

@Preview(showBackground = true)
@Composable
fun PayeeManageHeader(
    onClickAddPayee: () -> Unit = {},
    onClickApprovePayee: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(
                onClick = { onClickAddPayee() },
                modifier = Modifier
                    .requiredSize(100.dp)
                    .border(width = 4.dp, color = Orange, shape = CircleShape)
                    .background(Color.White, shape = CircleShape)
                    .padding(16.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_payee_add),
                        contentDescription = null,
                        tint = DarkBlue,
                        modifier = Modifier.requiredSize(30.dp)
                    )

                    Text(
                        text = "Add Payee",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = DarkBlue,
                            fontSize = 11.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }

            IconButton(
                onClick = { onClickApprovePayee() },
                modifier = Modifier
                    .requiredSize(100.dp)
                    .border(width = 4.dp, color = Orange, shape = CircleShape)
                    .background(DarkBlue, shape = CircleShape)
                    .padding(16.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_approve),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.requiredSize(30.dp)
                    )

                    Text(
                        text = "Approve Payee",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 11.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        }

    }

}