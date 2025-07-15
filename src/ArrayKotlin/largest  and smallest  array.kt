package ArrayKotlin

fun  main(){

    val  number =  arrayOf(20,22,50,12,40,100,200,40)

    var  largest =  number[0]
    var  smallest  =  number[0]

    println("Size of array : ${number.size}")

    for (num in number){
        if (num > largest){
            largest = num
        }

        if (num  < smallest){
            smallest = num
        }
    }

    println("Largest element : $largest")
    println("Smallest  element :$smallest")

}