data class Product(val id: Int, val name: String, val price: Double)

fun main() {
    // List of products
    val products = listOf(
        Product(1, "Pen", 25.0),
        Product(2, "Headphones", 1299.0),
        Product(3, "Notebook", 120.0),
        Product(4, "Smartwatch", 2450.0),
        Product(5, "Bag", 480.0)
    )

    // Call the function to filter and print
    printExpensiveProducts(products)
}

// Function to print products over ₹500
fun printExpensiveProducts(productList: List<Product>) {
    println("🛒 Products priced over ₹500:")
    for (product in productList) {
        if (product.price > 500) {
            println("- ${product.name} (₹${product.price})")
        }
    }
}
