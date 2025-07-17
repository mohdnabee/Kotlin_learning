
class  BankAccount(
    private  val  accountHolder: String,
    private val  accountNumber: Int,
    private var balance: Double =  0.0
){

    fun  deposit(amount : Double){
        if (amount > 0){
            balance+=  amount
            println("₹$amount deposited successfully")
        }else {
            println("Invalid deposit amount")
        }
    }


    fun  withdraw(amount : Double){
        if (amount <=  balance){
            balance -= amount
            println("₹$amount withdraw successfully")
        }else{
            println("Insufficient balance.")
        }
    }

    fun checkBalance(){
        println("Current balance for  $accountHolder: ₹$balance")
    }

    fun getAccountDetails(){
        println("Account Holder : $accountHolder")
        println("Account Number : $accountNumber")
        println("Balance :  ₹$balance")
    }

}

fun  main  (){

    val  account =  BankAccount("Nabeel", 12345678)

    while (true){
        println("\n|-₹-------Bank Menu-------₹-|")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Check Balance")
        println("4. Account Details")
        println("5. Exit")

        print("Enter your choice : ")
        val choice =  readLine()?.toIntOrNull()?: continue

        when  (choice){
            1-> {
                print("Enter amount to deposit: ")
                val  amt  =  readLine()?.toDoubleOrNull()
                if(amt != null) account.deposit(amt)
            }

            2-> {
                print("Enter the amount to  withdraw: ")
                val  amt=  readLine()?.toDoubleOrNull()
                if(amt != null)account.withdraw(amt)
            }

            3-> account.checkBalance()
            4-> account.getAccountDetails()

            5-> {
                println("Thank you  for banking with  us!")
                break
            }
            else -> print("Invalid choice!")

        }
    }

}