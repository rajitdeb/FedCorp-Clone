package com.rajit.fedcorpclone.components.payeemanagement.addpayee

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun AddPayee() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column {

            BeneficiaryNameField()

            NickNameField()

            AccountNumberField()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BeneficiaryNameField() {

    val beneficiaryName = rememberSaveable { mutableStateOf("") }

    TextField(
        value = beneficiaryName.value,
        onValueChange = { name ->
            beneficiaryName.value = name
        },
        label = { Text(text = "Enter Beneficiary Name (*)") },
        maxLines = 1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun NickNameField() {

    val beneficiaryNickName = rememberSaveable { mutableStateOf("") }

    TextField(
        value = beneficiaryNickName.value,
        onValueChange = { nickName ->
            beneficiaryNickName.value = nickName
        },
        label = { Text(text = "Enter Beneficiary Nick Name (*)") },
        maxLines = 1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun AccountNumberField() {

    // TODO("ONLY SUPPORT NUMBERS")

    val beneficiaryAccountNumber = rememberSaveable { mutableStateOf("") }

    TextField(
        value = beneficiaryAccountNumber.value,
        onValueChange = { accountNumber ->
            beneficiaryAccountNumber.value = accountNumber
        },
        label = { Text(text = "Enter Beneficiary Account Number (*)") },
        maxLines = 1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}