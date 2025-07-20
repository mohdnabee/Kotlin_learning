package classData

fun  main(){

    val  nums =  mutableListOf(1,2,3,4,5,6)
    val  evens =  nums.filter { it % 2 ==0 }
    println("evens number $evens")

    val  odd = nums.filter { it %2 != 0 }
    println("odds numbers $odd")
}