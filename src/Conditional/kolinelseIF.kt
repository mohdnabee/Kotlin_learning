package Conditional

fun main(){
    //  Use else if to specify a new condition if the first condition is false.
    //
    //Syntax
    //if (condition1) {
    //  // block of code to be executed if condition1 is true
    //} else if (condition2) {
    //  // block of code to be executed if the condition1 is false and condition2 is true
    //} else {
    //  // block of code to be executed if the condition1 is false and condition2 is false
    //}

    //  example

    val time =  22
    if (time <10 ){
        println("Good morning.")
    } else if (time <20){
        println("Good Day.")
    }else{
        println("Good evening")
    }// Outputs "Good evening."


    //  Kotlin If..Else Expressions
    //In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):
    //
    //Example

    println()
    println("Kotlin If..Else Expressions")
    val timeX=  20
    val  greeting =  if (time <18){
        "  good day."
    }else{
        "good coder"
    }
    println(greeting)

    //  hen using if as an expression, you must also include else (required).
    //  Note: You can ommit the curly braces {} when if has only one statement:

    //  example
    println()
    val newTime =  25
    val newGreeting =  if (newTime <18) "kotlin learning. " else "Kotlin program. "
    println(newGreeting)
}