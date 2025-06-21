package questions

fun main () {
    val  itemPrice =  12.99
    val quantity  =  5
    val taxRate =  0.08
    val discount =  2.50

    //  calculates the amounts
    val  subTotal  =  itemPrice *  quantity
    val  taxAmount =  subTotal * taxRate
    val discountedAmount =  subTotal -  discount
    val  finalTotal =  discountedAmount +  taxAmount

    // print values :

    println("Shopping Calculator Results :")
    println("--------------------------")
    println("Item Price: $$itemPrice" )
    println("Quantity: $quantity")
    println("Subtotal: $$subTotal")
    println("Tax Amount: $$taxAmount")
    println("Discounted Amount: $$discountedAmount")
    println("Final Total: $$finalTotal")
}

