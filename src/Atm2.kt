import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    println("ATM")

    var balance = 300.0
    var depositCount = 0
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val history = mutableListOf<String>()

    while (true) {

        println("\n=== Bank of Kotlin ===")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Check Balance")
        println("4. Transaction History")
        println("5. Exit")
        print("Select an option (1-5): ")

        when (readln()) {
            "1" -> {
                print("Enter the amount to deposit: ₹")
                val amount = readln().toDoubleOrNull()
                if (amount != null && amount > 0) {
                    balance += amount
                    depositCount++
                    history.add("Deposited ₹$amount on ${LocalDateTime.now().format(formatter)}")

                    // Interest after every 3rd deposit
                    if (depositCount % 3 == 0) {
                        val interest = balance * 0.02
                        balance += interest
                        println("🎉 Interest ₹${"%.2f".format(interest)} added to your account!")
                        history.add("Interest ₹${"%.2f".format(interest)} added on ${LocalDateTime.now().format(formatter)}")
                    }

                    println("₹$amount deposited successfully.")
                    printReceipt("Deposit", amount, balance)

                } else {
                    println("Invalid amount.")
                }
            }

            "2" -> {
                print("Enter amount to withdraw: ₹")
                val amount = readln().toDoubleOrNull()
                if (amount != null && amount > 0) {
                    if (amount <= balance) {
                        balance -= amount
                        println("₹$amount withdrawn successfully.")
                        history.add("Withdrew ₹$amount on ${LocalDateTime.now().format(formatter)}")
                        printReceipt("Withdraw", amount, balance)
                    } else {
                        println("Insufficient balance.")
                    }
                } else {
                    println("Invalid amount.")
                }
            }

            "3" -> {
                println("Current Balance: ₹$balance")
            }

            "4" -> {
                println("\n=== Transaction History ===")
                if (history.isEmpty()) println("No transactions yet.")
                else history.forEach { println(it) }
            }

            "5" -> {
                println("Thank you for using Bank Of Kotlin ATM!")
                break
            }

            else -> println("Invalid option. Please try again.")
        }
    }
}

// 🧾 Receipt Function
fun printReceipt(type: String, amount: Double, balance: Double) {

    val now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
    println("\n======= Receipt =======")
    println("Transaction Type : $type")
    println("Amount           : ₹$amount")
    println("Date & Time      : $now")
    println("Remaining Balance: ₹${"%.2f".format(balance)}")
    println("========================\n")

}
