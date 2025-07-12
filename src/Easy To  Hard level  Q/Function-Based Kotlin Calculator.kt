package `Easy To  Hard level  Q`

fun calculate(num1: Double, num2: Double, operator: String): Any {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Error: Cannot divide by zero"
        "%" -> if (num2 != 0.0) num1 % num2 else "Error: Cannot mod by zero"

        else -> "Error: Invalid operator"
    }
}

fun main() {

    println("Enter first number:")
    val num1 = readln().toDouble()

    println("Enter second number:")
    val num2 = readln().toDouble()

    println("Enter operator (+, -, *, /, %):")
    val operator = readln()

    val result = calculate(num1, num2, operator)
    println("Result: $result")
}
