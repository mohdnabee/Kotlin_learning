package ArrayKotlin

fun  main(){

    val  numbers =  arrayOf(12,13,14,15,16)

    var  sum =0

    for (num in numbers){
        sum += num
    }

    val  average =  sum.toDouble() /  numbers.size

    println("Sum  of array  Elements:  $sum")
    println("Average of array  Elements : $average")
}