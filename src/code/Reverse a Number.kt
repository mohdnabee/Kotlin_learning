fun  main (){


    var number =  1234
    var reversed =  0

    while (number !=0){
        val  digit =  number %10
        reversed =  reversed *10  +digit
        number /=  10
    }

    println("Reversed Number :  $reversed")
}