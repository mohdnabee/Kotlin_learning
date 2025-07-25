package highlevel

fun  calculator (a: Int, b: Int,  operation:(Int, Int)-> Int): Int{
    return operation(a,b)
}

fun main(){

    val  sum  =  calculator(5,10){x,y -> x+y}
    val  multiply =  calculator(5,10){x,y -> x*y}

    println("Sum : $sum")
    println("Multiply  : $multiply")

}

//  🧠 Explanation
//calculate() takes two integers and a function (operation) as a parameter.
//
//This is called a higher-order function because it takes another function as an argument.
//
//Lambdas { x, y -> x + y } and { x, y -> x * y } are passed at runtime.