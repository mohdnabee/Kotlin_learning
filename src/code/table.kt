package code

fun main (){

    print("Enter a Number : ")
    val  number =  readln().toInt()

    for (i  in 1..10){
        println("$number x $i = ${number*i}")
    }

    println("thanks")
}