package Function

//  Function Parameters
//Information can be passed to functions as parameter.
//
//Parameters are specified after the function name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma. Just note that you must specify the type of each parameter (Int, String, etc).
//
//The following example has a function that takes a String called fname as parameter. When the function is called, we pass along a first name, which is used inside the function to print the full name:


fun myFunction1(fname : String){
    println(fname+ "Doe" )
}

fun main(){

    myFunction1("John ")
    myFunction1("Jane ")
    myFunction1("George ")
   //  When a parameter is passed to the function, it is called an argument. So, from the example above: fname is a parameter, while John, Jane and George are arguments.




}