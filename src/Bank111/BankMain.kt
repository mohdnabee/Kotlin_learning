package Bank111

fun main(){

    val nabeelBackAccount = BankAccount("Mohd Nabeel",1338.20)
    val  ba3 = BankAccount("Sarah" ,0.0)
    val Asus = BankAccount("Asus Tuf", 1200.00)
    val realme = BankAccount("realme" , 350.00)

    nabeelBackAccount.deposit(250.0)
    nabeelBackAccount.withdraw(1200.00)
    nabeelBackAccount.deposit(3000.00)
    nabeelBackAccount.deposit(2000.00)
    nabeelBackAccount.withdraw(3333.00)

    ba3.deposit(100.0)
    ba3.withdraw(10.0)
    ba3.deposit(300.0)
    ba3.deposit(1000.0)
    ba3.withdraw(278.00)

    Asus.deposit(100.0)
    Asus.withdraw(560.00)
    Asus.deposit(670.00)
    Asus.deposit(400.00)

    realme.deposit(100.00)
    realme.deposit(250.00)
    realme.withdraw(120.00)

    nabeelBackAccount.displayTransactionHistory()

    println("${nabeelBackAccount.accountHolder}'s balance is $${nabeelBackAccount.acctBalance()} ")

    println()
    ba3.displayTransactionHistory()
    println("${ba3.accountHolder}'s balance is $${ba3.acctBalance()}")

    println()
    Asus.displayTransactionHistory()
    println("${Asus.accountHolder}'s balance is $${Asus.acctBalance()}")

    println()
    realme.displayTransactionHistory()
    println("${realme.accountHolder}'s balnace is $${realme.acctBalance()}")


    println("Shows all  money depsoited in bank")


}