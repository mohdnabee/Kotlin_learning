package code

fun main() {
    val rows = 5
    var number = 1

    for (i in 1..rows) {
        for (j in 1..i) {
            print("${number++} ")
        }
        println()
    }
}