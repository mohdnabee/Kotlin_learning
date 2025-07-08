package Conditional.WhenC

fun  main(){
    println("enter The Integer Value Only ")

    println("enter Number One")
    val  num1 =  readln().toInt()
    println("enter Number two ")
    val  num2 =  readln().toInt()

    println("Enter The Operators: / , + , -, *")
    val  oper =  readln()

    val  result =  when(oper){

        "/" ->  "divide  of $num1 $oper $num2 :  ${num1 / num2}"
        "+" ->  "addition of $num1  $oper  $num2 :  ${num1 + num2}"
        "-" ->  "subtraction  of $num1  $oper $num2 :  ${num1 - num2}"
        "*" ->  "Product of $num1  $oper $num2 :  ${num1 * num2}"


        else ->  "Invalid or Special  Character "

    }
    println(result)

}