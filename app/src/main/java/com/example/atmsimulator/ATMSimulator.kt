package com.example.atmsimulator


fun main() {

    var balance = 1000.0 // initial balance in bank
    var isRunning = true

    while (isRunning) {
        println("\nWelcome to Simple ATM ")
        println("1.Check balance")
        println("2.Deposit")
        println("3.Withdraw")
        println("4.Exit")
        println("5.Choose an option(1-4)")

        when (readLine()) {

            "1" -> {
                println("Current balance: %.2f".format(balance))
            }

            "2" -> {
                println("Enter amount to deposit")
                var deposit = readLine()?.toDoubleOrNull()
                if (deposit != null && deposit > 0) {
                    balance += deposit
                    println("$deposit deposited successfully")
                } else {
                    println("Invalid deposit amount")
                }
            }

            "3" -> {
                println("Enter the amount to withdraw")
                val withdraw = readLine()?.toDoubleOrNull()
                if (withdraw != null && withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw
                    println("$withdraw withdrawn successfully")
                } else {
                    println("Invalid amount or insufficient balance")
                }
            }

            "4" -> {
                println("Thank you for choosing the atm. good bye!")
                isRunning = false
            }

            else -> {
                println("Invalid input, Try again")
            }

        }

    }

}

