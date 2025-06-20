package Conditional

import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)
    print("Enter the value of a ")
     val  a = scanner.nextDouble()
    print("Enter the value of b ")
    val b =  scanner.nextDouble()

    print("Enter operator (+, -, *, /): ")
    val  oper =  scanner.next()[0]


    val result =  when (oper){
        '+' ->  a +b
        '-' ->  a-b
        '*' ->  a*b
        '/' ->  {
            if (b  != 0.0) a/b else {
                println("Error : cannot be divide by 0")
                return
            }
        }
        else -> {
            println("Invalid Operator")
            return
        }
    }
    println("Result : $a $oper $b =  $result " )

}