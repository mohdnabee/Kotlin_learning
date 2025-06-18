package loops.WhileLoops

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter number: ")
    var num = sc.nextInt()
    var count = 0
    while (num != 0) {
        count++
        num /= 10
    }
    println("Digits: $count")
}
