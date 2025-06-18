package loops.WhileLoops

fun main(){
     var number =  12345
    var reversed =  0

    while (number !=0){
        var digit =  number % 10
        reversed =  reversed *10 +digit
        number /=  10

    }
    println("Reversed: $reversed")
}