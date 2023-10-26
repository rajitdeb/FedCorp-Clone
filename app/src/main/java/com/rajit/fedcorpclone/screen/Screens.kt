package com.rajit.fedcorpclone.screen

sealed class Screens(val route: String) {

    object Home: Screens(route = "home")

    object AccountDetails: Screens(route = "account_details")

    object PayeeManagement: Screens(route = "payee_management")

    object AddPayee: Screens(route = "add_payee")

    object ApprovePayee: Screens(route = "approve_payee")

    object QuickPay: Screens(route = "quick_pay")

    object MiniStatement: Screens(route = "mini_statement")

    object FundTransfer: Screens(route = "fund_transfer")

    object SchedulePayment: Screens(route = "schedule_payment")

    object KnowYourTransactionLimit: Screens(route = "know_transaction_limit")

    object CardStatus: Screens(route = "card_status")

    object ReportTransaction: Screens(route = "report_transaction")

}