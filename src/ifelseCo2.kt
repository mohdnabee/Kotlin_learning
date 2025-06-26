fun main (){
    var age =  0
    println("Please enter your age as a whole number")
    //  read what the user has entered into the console
    var enteredValue= readln()
    // convert the String variable into a int variable
    age= enteredValue.toInt()
    //  age =  readln().toInt() //  user input

    if (age >=  40){
        println("You can not go into the club, please go home")
    }
    else if (age >=18) {
        println("you can enter the club")
    }else{
        println("You are too  young to go into the club!")
    }


    //  second condition
    println()

    if (age >=18 &&  age < 40){
        println("you can go the clube ")
    }else if (age >= 40){
        println("you are too old ")
    }else{
        println("you are too  young ")
    }

println()
    //  third condition

    if (age in 18 ..39){
        println("you can go the clube ")
    }else if (age >= 40){
        println("you are too old ")
    }else{
        println("you are too  young ")
    }

}