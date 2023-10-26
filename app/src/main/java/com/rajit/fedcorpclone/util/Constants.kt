package com.rajit.fedcorpclone.util

import com.rajit.fedcorpclone.R
import com.rajit.fedcorpclone.model.Bank
import com.rajit.fedcorpclone.model.Payee
import com.rajit.fedcorpclone.model.UserActionItem

object Constants {

    val userActions = listOf(

        UserActionItem(
            R.drawable.ic_account_details,
            "Account Details"
        ),

        UserActionItem(
            R.drawable.ic_payee_add,
            "Payee Management",
        ),

        UserActionItem(
            R.drawable.ic_payment,
            "Quick Pay"
        ),

        UserActionItem(
            R.drawable.ic_mini_statement,
            "Mini Statement"
        ),

        UserActionItem(
            R.drawable.ic_fund_transfer,
            "Fund Transfer"
        ),

        UserActionItem(
            R.drawable.ic_schedule_payment,
            "Schedule  Payments"
        ),

        UserActionItem(
            R.drawable.ic_know_transaction_limit,
            "Know Transaction Limits"
        ),

        UserActionItem(
            R.drawable.ic_card_status,
            "Card Status"
        ),

        UserActionItem(
            R.drawable.ic_report_transaction,
            "Report Transactions"
        )
    )

    val payees = listOf<Payee>(
        Payee(
            beneficiaryName = "Good Year Enterprise",
            nickName = "Good Year Enterprise (Delhi)",
            accountNumber = "0000354166400166",
            ifsc = "BARB0RAMDEL",
            bank = Bank.OTHER_BANK
        ),

        Payee(
            beneficiaryName = "Janata Stores",
            nickName = "Janata Stores (Ramlal Ji) Kota",
            accountNumber = "1248877002347690",
            ifsc = "FDRL0002225",
            bank = Bank.FEDERAL_BANK
        ),

        Payee(
            beneficiaryName = "Jeevan Pradhan & Sons",
            nickName = "Jeevan Pradhan & Sons (Lucknow)",
            accountNumber = "0001248759569990",
            ifsc = "IDIB000H561",
            bank = Bank.OTHER_BANK
        ),

        Payee(
            beneficiaryName = "Praveen Associates & Co.",
            nickName = "Praveen Bhargav Delhi",
            accountNumber = "7011514560000464",
            ifsc = "PUNB0701100",
            bank = Bank.OTHER_BANK
        ),

        Payee(
            beneficiaryName = "Shringaar",
            nickName = "Shringaar Jatin Ji Kolkata",
            accountNumber = "1400232499970001",
            ifsc = "FDRL0001400",
            bank = Bank.FEDERAL_BANK
        ),

        Payee(
            beneficiaryName = "Deka Brothers",
            nickName = "Mohan Ji Deka (Dibrugarh)",
            accountNumber = "0003416787901001",
            ifsc = "SBIN0000071",
            bank = Bank.OTHER_BANK
        ),

        Payee(
            beneficiaryName = "Ananya Fashion",
            nickName = "Shyamlal Pandey Ji (Noida)",
            accountNumber = "0008147008971346",
            ifsc = "HDFC0000088",
            bank = Bank.OTHER_BANK
        ),

        Payee(
            beneficiaryName = "Chaudhary Chemicals",
            nickName = "Chaudhary Sahab (Gurugram)",
            accountNumber = "0326331400046779",
            ifsc = "SBIN0032633",
            bank = Bank.OTHER_BANK
        )
    )

}