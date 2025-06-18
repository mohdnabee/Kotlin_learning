fun  main(){
    //  Kotlin Booleans
    //Very often, in programming, you will need a data type that can only have one of two values, like:
    //
    //YES / NO
    //ON / OFF
    //TRUE / FALSE
    //For this, Kotlin has a Boolean data type, which can take the values true or false.
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    // Just like you have learned with other data types in the previous chapters, the example above can also be written
    // without specifying the type, as Kotlin is smart enough to understand that the variables are Booleans:

    val isKotlinFun1 = true
    val isFishTasty2 = false
    println(isKotlinFun1)   // Outputs true
    println(isFishTasty2)   // Outputs false
    println()

    // Boolean Expression
    //A Boolean expression returns a Boolean value: true or false.
    //
    //You can use a comparison operator, such as the greater than (>) operator to find out if an expression (or a variable) is true:

    println("Boolean  Expression")
    val x  =  10
    val y =  9
    println(x>y)//  return true ,  because 10  is greater than 9
    //  or even easier :
    println(10 > 9 )// Returns true, because 10 is greater than 9

    //  In the examples below, we use the equal to (==) operator to evaluate an expression:
     val x1=  10  ;
    println(x == 10); //  // Returns true, because the value of x is equal to 10
    println(10 == 15); // Returns false, because 10 is not equal to 15


}