package ArrayKotlin

fun main(){
    //  Kotlin Arrays
    //Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
    //
    //To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:

    val  cars =  arrayOf("BMW" , "FORD", "AUDI", "THAR")
    //  Access the Elements of an Array
    //You can access an array element by referring to the index number, inside square brackets.
    //
    //In this example, we access the value of the first element in cars:
    println(cars[0])
    println(cars[3])


    //  Change an Array Element
   //  To change the value of a specific element, refer to the index number:

    cars[0]= "Bugatti"
    println()
    println(cars[0])

    //  Array Length / Size
    //To find out how many elements an array have, use the size property:

    val bike =  arrayOf("KTM", "BULLET", "H2R", "PULSAR")
    println("Size of an array : " +bike.size)
    //  outputs 4


    // Check if an Element Exists
    //You can use the in operator to check if an element exists in an array:


    if ("H2R" in bike) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }


    //  Loop Through an Array
    //Often when you work with arrays, you need to loop through all of the elements.
    //
    //You can loop through the array elements with the for loop, which you will learn even more about in the next chapter.
    //
    //The following example outputs all elements in the cars array:

    val card = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in card) {
        println(x)
    }
}