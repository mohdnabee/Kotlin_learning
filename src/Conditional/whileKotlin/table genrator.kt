package Conditional.whileKotlin

fun  main(){

    while (true){
        println("Enter a number to  prints its table (or type 'exit' to quit):")
        val input = readln().trim()

        if (input.lowercase() ==  "exit"){
            println("Thanks for using the table generator!")
            break
        }

        val  number =  input.toIntOrNull()
        if (number ==  null){
            println("Invalid input. Please enter a valid number.")
            continue
        }

        println("Multiplication Table of $number:")
        for (i in 1..10){
            println("$number x $i = ${number * i}")
        }

        println()
    }
}