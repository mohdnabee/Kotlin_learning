package kotlinBreak_Continue

fun main(){
// Kotlin Break and Continue
    //  Kotlin Break
    //The break statement is used to jump out of a loop.
    //
    //This example jumps out of the loop when i is equal to 4:

    // Example
     var i = 0
    while (i<10){
        println(i)
        i++
        if (i == 4){
            break
        }
    }


    //  Kotlin Continue
    //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
    //
    //This example skips the value of 4:
    //  Example

    var x =  0
    while (i <10){
        if (i  == 4){
            i++
            continue
        }
        println(i)
        i++
    }
}