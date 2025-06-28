fun  main (){
    println("Enter Your Marks ")
    val  marks =  readln().toInt()




    when (marks) {
        in 90 ..100 -> {
            println("A")
        }
        in 80  .. 89 -> {
            println("B")
        }
        in 70 ..79 -> {
            println("C")
        }
        else -> {
            println("fail")
        }
    }

}