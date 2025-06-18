package Function

//  Return Values
//In the examples above, we used functions to output a value.
// In the following example, we will use a function to return a
// value and assign it to a variable.
//
//To return a value, use the return keyword, and specify the
// return type after the function's parantheses (Int in this example):


//Example
//A function with one Int parameter, and Int return type:

fun myFun(X : Int ) :Int{
    return (X+5)
}




//  Using two parameters:
//
//Example
//A function with two Int parameters, and Int return type:


fun myFun2( x: Int ,y: Int): Int{
    return (x+y)
}



fun main(){
    var result =  myFun(3)
    println(result)


    //  call two parameters
    var callFun =  myFun2(3,5)
    println(callFun)
}