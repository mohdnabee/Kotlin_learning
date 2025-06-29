fun main() {
    print("Enter number of coins: ")
    val n = readln().toInt()

    // Calculate 2^n using loop (no Math.pow)
    var totalCombinations = 1
    for (i in 1..n) {
        totalCombinations *= 2
    }

    println("\nTotal Combinations: $totalCombinations")
    println("Combinations and count of H and T:\n")

    for (i in 0 until totalCombinations) {
        var combo = ""
        var heads = 0
        var tails = 0
        var num = i

        // Convert number to binary and map 0 -> T, 1 -> H
        for (j in 1..n) {
            if (num % 2 == 1) {
                combo = "H$combo"
                heads++
            } else {
                combo = "T$combo"
                tails++
            }
            num /= 2
        }

        println("$combo  ->  Heads: $heads, Tails: $tails")
    }
}
