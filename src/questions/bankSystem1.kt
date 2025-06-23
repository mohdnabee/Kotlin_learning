package questions
import java.util.Scanner

class BankAccount(
    val accountNumber: String,
    val accountHolder: String,
    private var balance: Double
) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("✅ Deposited ₹$amount. New balance: ₹$balance")
        } else {
            println("❌ Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("❌ Insufficient balance. Current balance: ₹$balance")
        } else if (amount <= 0) {
            println("❌ Withdrawal amount must be positive.")
        } else {
            balance -= amount
            println("✅ Withdrew ₹$amount. New balance: ₹$balance")
        }
    }

    fun displayInfo() {
        println("\n--- Account Info ---")
        println("Account Number: $accountNumber")
        println("Account Holder: $accountHolder")
        println("Balance: ₹$balance")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter Account Number: ")
    val accNum = readln()
    print("Enter Account Holder Name: ")
    val holder = readln()
    print("Enter Initial Balance: ₹")
    val balance = scanner.nextDouble()

    val account = BankAccount(accNum, holder, balance)

    while (true) {
        println("\n--- Bank Menu ---")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Display Account Info")
        println("4. Exit")
        print("Enter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter deposit amount: ₹")
                val amount = scanner.nextDouble()
                account.deposit(amount)
            }

            2 -> {
                print("Enter withdrawal amount: ₹")
                val amount = scanner.nextDouble()
                account.withdraw(amount)
            }

            3 -> account.displayInfo()

            4 -> {
                println("🚪 Exiting... Thank you!")
                break
            }

            else -> println("❌ Invalid choice.")
        }
    }
}
