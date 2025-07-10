fun main  (){
    println("ATM")

    var balance =  300.0

    while (true){
        println("\n=== Bank of Kotlin ===")
        println("1.  Deposit")
        println("2.  Withdraw")
        println("3.  Check Balance")
        println("4.  Exit")
        print("Select  an  option (1-4): ")


        when(readln()){
            "1" ->{
                print("Enter The amount to  deposit: ₹")
                val amount = readln().toDoubleOrNull()
                if(amount != null  && amount >0){
                    balance +=  amount
                    println("₹$amount deposited successfully")
                }else{
                    println("Invalid amount.")
                }
            }

            "2" ->{
                print("Enter amount to withdraw : ₹")
                val  amount =  readln().toDoubleOrNull()
                if (amount != null && amount >0){
                    if (amount <=  balance){
                        balance-= amount
                        println("₹$amount withdraw successfully.")
                    }else{
                        println("Insufficient balance.")
                    }
                }else{
                    println("Invalid amount.")
                }
            }

            "3" -> {
                println("Current Balance :  ₹$balance")
            }

            "4" -> {
                println("Thanks You For using Bank Of Kotlin! ATM")
                break
            }

            else -> {
                println("Invalid option. Please try  again. ")
            }


        }

    }



}