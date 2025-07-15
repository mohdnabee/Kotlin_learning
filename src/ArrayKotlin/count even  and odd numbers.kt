package ArrayKotlin

fun  main  (){

    val  numbers=  arrayOf(10,20,40,50,13,23,43)

    var evenCount =  0
    var  oddCount =0

    for (num in numbers){
        if (num % 2 ==  0){
            evenCount++
        }
        else{
            oddCount++
        }
    }

    println("Even numbers count :$evenCount")
    println("Odd numbers count : $oddCount")

}