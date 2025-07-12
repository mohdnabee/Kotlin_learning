package `Easy To  Hard level  Q`

fun details(name: String, price: Int, ram: Int, processor: String){

    println("Name : $name")
    println("Price : $price rs")
    println("Ram : $ram GB")
    println("Processor : $processor")

}



fun  main (){

    details(
        "Asus Tuf Gaming f15",
        60000,
        16
        ,"i5"
    )

    println()
    details("Realme 8 pro",18000,6, "Snapdragon 720G")

}