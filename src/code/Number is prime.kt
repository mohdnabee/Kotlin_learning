package code

fun  main (){

    val  number =  21
    var isPrime =  true

    if (number <=1) isPrime =  false
    else{
        for (i  in 2  until number){
            if (number % i ==  0){
                isPrime =  false
                break
            }
        }
    }

    if (isPrime)
        println("$number is a Prime Number")
    else
        println("$number is Not a Prime Number")

}