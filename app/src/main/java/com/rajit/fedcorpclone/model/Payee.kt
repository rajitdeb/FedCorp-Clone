package com.rajit.fedcorpclone.model

data class Payee(
    val beneficiaryName: String,
    val nickName: String,
    val accountNumber: String,
    val ifsc: String,
    val bank: Bank,
    val mobileNumber: String? = null,
    val mmID: String? = null
)
