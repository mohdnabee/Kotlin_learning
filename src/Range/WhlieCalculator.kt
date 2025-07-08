package Range

fun main() {
    while (true) {
        println("Enter 'exit' at any time to quit.")

        print("Enter Number 1: ")
        val input1 = readln().trim()
        if (input1.lowercase() == "exit") break
        val num1 = input1.toIntOrNull()
        if (num1 == null) {
            println("Invalid number. Try again.")
            continue
        }

        print("Enter Number 2: ")
        val input2 = readln().trim()
        if (input2.lowercase() == "exit") break
        val num2 = input2.toIntOrNull()
        if (num2 == null) {
            println("Invalid number. Try again.")
            continue
        }

        print("Enter Operator (+, -, *, /): ")
        val operator = readln().trim().lowercase()
        if (operator == "exit") break

        when (operator) {
            "+" -> println("Result: $num1 + $num2 = ${num1 + num2}")
            "-" -> println("Result: $num1 - $num2 = ${num1 - num2}")
            "*" -> println("Result: $num1 * $num2 = ${num1 * num2}")
            "/" -> {
                if (num2 != 0) {
                    println("Result: $num1 / $num2 = ${num1 / num2}")
                } else {
                    println("Error: Division by zero.")
                }
            }
            else -> println("Invalid operator. Please use +, -, *, or /.")
        }

        println() // Empty line for readability
    }

    println("Thanks for using the calculator!")
}
