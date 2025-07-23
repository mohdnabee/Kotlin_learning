fun main() {
    print("Enter size: ")
    val n = readLine()!!.toIntOrNull() ?: return
    butterfly(n)
}

fun butterfly(n: Int) {
    for (i in 1..n) {
        print("*".repeat(i))
        print(" ".repeat(2*(n - i)))
        print("*".repeat(i))
        println()
    }
    for (i in n - 1 downTo 1) {
        print("*".repeat(i))
        print(" ".repeat(2*(n - i)))
        print("*".repeat(i))
        println()
    }
}
