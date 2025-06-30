package code

fun main(){


    var  num =  121
    var temp  =  num
    var reversed =  0


    while (num != 0){
        val  digit =  temp %  10
        reversed =  reversed *  10  + digit
        temp/=  10
    }

    if ( num ==  reversed)
        println("$num is a palindrome")
    else
        println("$num is not palindrome")
}