package Function

// Shorter Syntax for Return Values

//There is also a shorter syntax for returning values.
// You can use the = operator instead of return without
// specifying the return type. Kotlin is smart enough to
// automatically find out what it is:

fun myShort(x: Int , y:Int) =  x+y


fun main (){
    var result =  myShort(3,5)
    println(result)
}