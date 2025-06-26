fun main(){

    //  structure of if else kotlin

   // if (true){
        //  then execute what's in here
    //}else {
        //  if not true then  execute this is here
    //}


    // comparison operators : ----
    // greater than   >
    // lower than     <
    // greater equal  >=
    // lower equal    <=
    // equal operators ==
    var age =  0
    println("Please enter your age as a whole number")
    //  read what the user has entered into the console
    var enteredValue= readln()
    // convert the String variable into a int variable
    age= enteredValue.toInt()
   //  age =  readln().toInt() //  user input

    if (age >=  18){
        println("You can go into the club")

    }
    else {
        println("You are too  young to go into the club!")
    }


}