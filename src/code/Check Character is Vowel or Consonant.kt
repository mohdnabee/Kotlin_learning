package code

fun main() {
    val ch = 'e'

    if (ch.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u'))
        println("$ch is a Vowel")
    else
        println("$ch is a Consonant")
}
