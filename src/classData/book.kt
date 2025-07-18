package classData

data class  Book (val title: String,  val author: String , val price: Double)


fun main (){

    val  shop = Book(
        "Fundamentals of Computer Alogritms",
        "Sartaj Sahni",
        800.89
    )

    //  print details
    println("Book  Details")
    println("Title ${shop.title}")
    println("Author ${shop.author}")
    println("Price ${shop.price}")

}


