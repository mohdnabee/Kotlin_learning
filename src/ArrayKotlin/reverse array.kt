package ArrayKotlin

fun  main(){

    val  orginal  =  arrayOf(10,20,30,40,50,60,70,80,90,100)

    val  reversed = Array(orginal.size){0} //  new array  of same size

    // original.indices gives all valid index positions.
    for (i in orginal.indices){
        //original.size - 1 - i accesses the corresponding element from the end.
        reversed[i] = orginal[orginal.size - 1 - i]
    }

    println("Original  Array :  ${orginal.joinToString()}")
    println("Reversed Array : ${reversed.joinToString () }")

}