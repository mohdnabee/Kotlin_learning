package  code

fun main (){

val  rows =  5
    var  letters = 'A'

    for (i  in 1..rows){
        for (j  in  1..i){
            print("$letters ")
            letters++
        }
        println()
    }

}