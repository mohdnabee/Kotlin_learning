package code

fun  main  (){
    print("Enter The Value Of a: ")
    var a = readln().toInt()
    print("Enter The Value Of b: ")
    var b = readln().toInt()

    a =  a+b
    b =  a-b
    a =  a-b

    println("after swap: a =  $a , b =  $b")
    println()
    println("This Code are Kotlin  based")
}