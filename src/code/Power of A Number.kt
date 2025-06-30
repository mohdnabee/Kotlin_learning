package code

fun main (){

    val base =  2
    val  exponent =  5
    var  result =  1

    for (i  in 1..exponent){
        result *=  base
    }

println("$base ^ $exponent =  $result")
}