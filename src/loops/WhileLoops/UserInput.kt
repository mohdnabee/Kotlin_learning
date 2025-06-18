package loops.WhileLoops

import java.util.Scanner

fun main(){

    val sc = Scanner(System.`in`)
    print("Enter the Value: ")
    val n  =  sc.nextInt()
    var i =1
    while (i <= n){
        println(i)
        i++
    }
}