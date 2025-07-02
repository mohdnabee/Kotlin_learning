package code

import kotlin.math.pow

fun main() {
    val number = 9474
    val digits = number.toString().length
    var temp = number
    var sum = 0

    while (temp != 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(digits).toInt()
        temp /= 10
    }

    if (sum == number)
        println("$number is an Armstrong Number")
    else
        println("$number is NOT an Armstrong Number")
}
