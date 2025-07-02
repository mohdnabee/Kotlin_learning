package  code

fun main (){

    val  ch =  'a'

    if (ch in  'a'..'z')
        println("${ch.uppercase()}")
    else if (ch  in 'A'..'Z')
        println("${ch.lowercase()}")
    else
        println("Not a letter or !ERROR!")

}