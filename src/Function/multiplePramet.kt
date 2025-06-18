package Function

//  Multiple Parameters
//You can have as many parameters as you like:

fun multiplePrameter( fname : String, age :Int ){
    println( fname + " is "+ age)
}

fun main (){
    multiplePrameter("John", 35)
    multiplePrameter("Jane" ,32)
    multiplePrameter("George" ,15)
}
// Note: When working with multiple parameters, the function call
// must have the same number of arguments as there are parameters,
// and the arguments must be passed in the same order.