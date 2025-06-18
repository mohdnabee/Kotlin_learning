package loops.WhileLoops

fun main(){
    //  print the sum of numbers from 1 to N

    val n = 10
    var sum =0
    var i =  1

    while (i  <=  n){
        sum += i
        i++
    }
    println("Sum: $sum")

}