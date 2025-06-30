package code

fun  main (){
    val  year  =  2024

    if ((year %  4 ==  0  && 100 != 0) ||  (year % 400  ==  0))
        println("$year is a Leap  Year")
    else
        println("$year is Not a leap  Year ")

}