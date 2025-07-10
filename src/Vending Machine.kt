fun main() {
    val items = mutableListOf(
        Item("Chips", 20, 5),
        Item("Chocolate", 30, 5),
        Item("Cold Drink", 40, 5),
        Item("Water Bottle", 10, 5)
    )

    var balance = 100  // User starting balance

    while (true) {
        println("\n=== Kotlin Vending Machine ===")
        println("Balance: ₹$balance")
        println("Available Items:")

        for ((index, item) in items.withIndex()) {
            println("${index + 1}. ${item.name} - ₹${item.price} (Stock: ${item.stock})")
        }

        println("5. Exit")
        print("Select an item (1-5): ")

        when (val choice = readln().toIntOrNull()) {
            in 1..4 -> {
                val selectedItem = items[choice!! - 1]
                if (selectedItem.stock <= 0) {
                    println("Sorry, ${selectedItem.name} is out of stock.")
                } else if (balance < selectedItem.price) {
                    println("Insufficient balance. Please add more money.")
                } else {
                    selectedItem.stock -= 1
                    balance -= selectedItem.price
                    println("You purchased ${selectedItem.name} for ₹${selectedItem.price}.")
                    println("Remaining balance: ₹$balance")
                }
            }
            5 -> {
                println("Thank you for using the vending machine!")
                break
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}

data class Item(val name: String, val price: Int, var stock: Int)
