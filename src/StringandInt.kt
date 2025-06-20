fun main (){

    var  calculator = "fx-82MS"
    var brand =  "Casio"

    var function =  240

    var edition =  "2th edition "
    var display = "2-line Display "
    var price = 625

    var year =  "08/2024"
    var warenety=  3
    var  discount   =  12.0
    var totaldis=  price * (discount /  100.0)

            println("calculator details")
    println("brand: " + brand + " "+ calculator)
    println("edition : "+edition)
    println("functions : "+ function)

    println("Display type : "+ display)
    println("price : "+ price)
    println("Manufactured :" +year)
    println("Warenety :" +warenety + "  years ")
    println ("discount :" + discount + "%  =  "+ totaldis )
    println("Total price :" + price+ " - " + totaldis + " = "+  (price - totaldis))
}
