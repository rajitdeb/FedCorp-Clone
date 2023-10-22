package com.rajit.fedcorpclone.util

import com.rajit.fedcorpclone.R
import com.rajit.fedcorpclone.model.UserActionItem

object Constants {

    val userActions = listOf(
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
            "Schedule Payments"
        ),

        UserActionItem(
            R.drawable.ic_notifications,
            "Notifications"
        ),

        UserActionItem(
            R.drawable.ic_know_transaction_limit,
            "Know Your Transaction Limits"
        ),

        UserActionItem(
            R.drawable.ic_card_status,
            "Card Status"
        ),

        UserActionItem(
            R.drawable.ic_report_transaction,
            "Report Transactions"
        ),
    )

}