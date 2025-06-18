package Conditional

fun main(){
    //  syntax
   // if (condition) {
        // block of code to be executed if the condition is true
   // }

    if (20 > 18) {
        println("20 is greater than 18")
    }


    //  example 2
    println()
    val  x =  20
    val  y =  18
    if(x>y){
        println("X is greater than y")
        //  Example explained
        //In the example above we use two variables, x and y, to test whether x is
    // greater than y (using the > operator). As x is 20, and y is 18,
    // and we know that 20 is greater than 18, we print to the screen that "x is greater than y".
    }


    //  Kotlin else
    //Use else to specify a block of code to be executed if the condition is false.

    // Syntax
    //if (condition) {
    //  // block of code to be executed if the condition is true
    //} else {
    //  // block of code to be executed if the condition is false
    //}

    val time =  20
    if (time < 18){
        println("Good day.")
    }else {
        println("Good evening.")
        // Outputs "Good evening."
    }

    val age =  16
    if (age >= 18){
        println("Valid for party")
    }else
        println("Not valid for party ")
}