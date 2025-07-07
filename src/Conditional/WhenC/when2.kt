package Conditional.WhenC

fun main(){
    val number =  5
    val  result =  when(number){

        1->"hello"
        2->"bye"
        3 -> "Good Day"
        4 -> "happy"
        5 ->"its Five"
        6 ->"less 1 than 7 "
        7 ->"last number"
        else -> "not valid number"
    }

    println(result)
}