fun  main (){

    println("Welcome to currency  Converter (INR)")

    print("Enter The Amount in INR: ₹")
    val  inrAmount =  readln().toDoubleOrNull()

    if (inrAmount != null && inrAmount >0){
        val usd = inrAmount * 0.012
        val eur = inrAmount * 0.011
        val gbp = inrAmount * 0.0096
        val jpy = inrAmount * 1.73

        println("\n=== Convert Amounts ===")
        println("USD: \$$usd")
        println("EUR: €$eur")
        println("GBP: £$gbp")
        println("JPY: ¥$jpy")

    }else{

        println("Invalid input. Please enter a positive number.")
    }

}