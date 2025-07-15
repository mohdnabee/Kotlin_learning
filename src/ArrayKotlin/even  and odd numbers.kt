package ArrayKotlin

fun main() {
    val numbers = arrayOf(10, 20, 30, 50, 11, 35, 37, 89)

    var even = 0
    var odd = 0

    for (num in numbers) {
        if (num % 2 == 0) {
            even++
            print("$num is Even\n")
        } else {
            odd++
            print("$num is Odd\n")
        }
    }

    println("Total Even numbers: $even")
    println("Total Odd numbers: $odd")
}
