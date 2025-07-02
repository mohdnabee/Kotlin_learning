package code

fun  main () {

    val text = "Kotlin  is Fun"
    var vowels = 0
    var consonants = 0

    for (ch in text.lowercase()){
        if (ch in "aeiou") vowels++
        else if (ch in 'a'..'z') consonants++
}
    println("Vowels: $vowels, Consonants: $consonants")

}