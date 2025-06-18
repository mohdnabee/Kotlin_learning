package loops.WhileLoops

import java.util.Scanner

fun main(){

    val sc = Scanner(System.`in`)
    print("Enter number: ")
    val original = sc.nextInt()
    var num = original
    var rev = 0
    while (num != 0) {
        val digit = num % 10
        rev = rev * 10 + digit
        num /= 10
    }
    println(if (original == rev) "Palindrome" else "Not Palindrome")

}