fun main (){
    val  num =  17
    var  isPrime = true


    if (num <2 ) isPrime = false
    for (i  in 2 until num){

        if (num % i == 0){
            isPrime =  false
            break
        }
    }
    println(if (isPrime) "$num is Prime"  else "$num is not prime ")
}