package code

fun main() {
    var number = 123456
    var evenSum = 0
    var oddSum = 0

    while (number != 0) {
        val digit = number % 10
        if (digit % 2 == 0) evenSum += digit else oddSum += digit
        number /= 10
    }

    println("Even Digit Sum: $evenSum")
    println("Odd Digit Sum: $oddSum")
}
