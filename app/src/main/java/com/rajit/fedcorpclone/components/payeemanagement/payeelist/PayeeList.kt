package com.rajit.fedcorpclone.components.payeemanagement.payeelist

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rajit.fedcorpclone.R
import com.rajit.fedcorpclone.components.payeemanagement.payeemanage.PayeeManageHeader
import com.rajit.fedcorpclone.model.ExpandState
import com.rajit.fedcorpclone.model.Payee
import com.rajit.fedcorpclone.util.Constants

@Preview(showBackground = true)
@Composable
fun PayeeList() {

    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxSize()
    ) {

        item { PayeeManageHeader() }

        items(Constants.payees.size) {

            val currentPayeeItem = Constants.payees[it]
            PayeeItem(currentPayeeItem)
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PayeeItem(payee: Payee = Constants.payees[0]) {

    val expandState = rememberSaveable {
        mutableStateOf(ExpandState.LESS)
    }

    val context = LocalContext.current

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue.copy(0.1f)
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp)
        ) {

            Column(
                modifier = Modifier.align(Alignment.TopStart).fillMaxWidth(0.89f)
            ) {

                Text(
                    text = "Nick Name",
                    style = TextStyle(color = Color.DarkGray.copy(0.5f), fontSize = 14.sp)
                )
                Text(
                    text = payee.nickName,
                    style = TextStyle(color = Color.Black, fontSize = 16.sp),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Beneficiary Name",
                    style = TextStyle(color = Color.DarkGray.copy(0.5f), fontSize = 14.sp)
                )
                Text(
                    text = payee.beneficiaryName.uppercase(),
                    style = TextStyle(color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                )

                if (expandState.value == ExpandState.MORE) {

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Beneficiary Account Number",
                        style = TextStyle(color = Color.DarkGray.copy(0.5f), fontSize = 14.sp),
                    )
                    Text(
                        text = payee.accountNumber,
                        style = TextStyle(color = Color.Black, fontSize = 18.sp),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Beneficiary IFSC Code",
                        style = TextStyle(color = Color.DarkGray.copy(0.5f), fontSize = 14.sp),
                    )
                    Text(
                        text = payee.ifsc,
                        style = TextStyle(color = Color.Black, fontSize = 18.sp),
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            Toast.makeText(
                                context,
                                "Delete Button Clicked",
                                Toast.LENGTH_SHORT
                            ).show()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Red
                        ),
                        modifier = Modifier
                            .height(45.dp)
                            .width(150.dp)
                    ) {
                        Text(text = "Delete", color = Color.White, fontSize = 16.sp)
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                }

            }

            val expandDrawable = if (expandState.value == ExpandState.MORE) {
                R.drawable.ic_expand_less
            } else {
                R.drawable.ic_expand_more
            }

            IconButton(
                onClick = {
                    if (expandState.value == ExpandState.MORE) {
                        expandState.value = ExpandState.LESS
                    } else {
                        expandState.value = ExpandState.MORE
                    }
                },
                modifier = Modifier.align(Alignment.TopEnd)
            ) {
                Icon(
                    painter = painterResource(
                        id = expandDrawable
                    ),
                    contentDescription = null
                )
            }

        }
    }
}