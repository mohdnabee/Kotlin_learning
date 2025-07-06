package code.Inhetance

fun  main(){

    var number :Int

    println("please enter a number")

    try{
        //  error-prone code you want to execute
        number =  readln().toInt()

        println("User entered $number")
    } catch (e : Exception){
        //  What should happen when an error occurs

        println("Error ${e.message}")

    }finally {
        number =  0
    }


}