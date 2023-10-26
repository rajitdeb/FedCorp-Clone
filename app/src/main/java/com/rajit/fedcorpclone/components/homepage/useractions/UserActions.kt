package com.rajit.fedcorpclone.components.homepage.useractions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rajit.fedcorpclone.R
import com.rajit.fedcorpclone.ui.theme.DarkBlue
import com.rajit.fedcorpclone.util.Constants

@Preview(showBackground = true)
@Composable
fun UserActions(
    onCLickAccountDetails: () -> Unit = {},
    onClickPayeeManagement: () -> Unit = {},
    onClickQuickPay: () -> Unit = {},
    onClickMiniStatement: () -> Unit = {},
    onClickFundTransfer: () -> Unit = {},
    onClickSchedulePayments: () -> Unit = {},
    onClickKnowTransactionLimits: () -> Unit = {},
    onClickCardStatus: () -> Unit = {},
    onClickReportTransactions: () -> Unit = {}
) {

    LazyVerticalGrid(
//        columns = GridCells.Adaptive(minSize = 90.dp),
        columns = GridCells.Fixed(3),
        userScrollEnabled = false,
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .background(DarkBlue)
            .fillMaxWidth()
            .height(340.dp),
    ) {

        val currentItem = Constants.userActions

        item {
            UserActionItem(
                iconId = currentItem[0].iconId,
                iconLabel = currentItem[0].label,
                onClick = { onCLickAccountDetails() }
            )
        }

        item {
            UserActionItem(
                iconId = currentItem[1].iconId,
                iconLabel = currentItem[1].label,
                onClick = { onClickPayeeManagement() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[2].iconId,
                iconLabel = currentItem[2].label,
                onClick = { onClickQuickPay() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[3].iconId,
                iconLabel = currentItem[3].label,
                onClick = { onClickMiniStatement() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[4].iconId,
                iconLabel = currentItem[4].label,
                onClick = { onClickFundTransfer() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[5].iconId,
                iconLabel = currentItem[5].label,
                onClick = { onClickSchedulePayments() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[6].iconId,
                iconLabel = currentItem[6].label,
                onClick = { onClickKnowTransactionLimits() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[7].iconId,
                iconLabel = currentItem[7].label,
                onClick = { onClickCardStatus() }

            )
        }

        item {
            UserActionItem(
                iconId = currentItem[8].iconId,
                iconLabel = currentItem[8].label,
                onClick = { onClickReportTransactions() }
            )
        }

//        items(Constants.userActions.size) { position ->
//
//            val currentItem = Constants.userActions[position]
//
//            UserActionItem(
//                iconId = currentItem.iconId,
//                iconLabel = currentItem.label,
//                onClick = { onClickPayeeManagement() }
//            )
//        }
    }
}

@Composable
fun UserActionItem(
    iconId: Int,
    iconLabel: String,
    onClick: () -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {

        IconButton(onClick = { onClick() }) {
            Icon(
                painter = painterResource(id = iconId),
                tint = colorResource(id = R.color.orange),
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(64.dp)
//                    .height(32.dp)
                    .background(color = Color.White, shape = CircleShape)
                    .padding(16.dp)
            )
        }

        Text(
            iconLabel,
            style = TextStyle(color = Color.White, fontSize = 13.sp),
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}