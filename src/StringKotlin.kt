import java.util.Locale
import java.util.Locale.getDefault

fun main (){
    println("kotlin String ")

    // Strings are used for storing text.
    //
    //A string contains a collection of characters surrounded by double quotes:

    var greeting = "Hello"
    println(greeting)

    var greet :  String =  "Hell"



    //  Access a String
    //  to access the characters (elemnts )  of a String , you must refer to the index number
    //  inside square brackets .

    //  String indexes star with 0 .  In the example below , we access the first  and third element in txt :

    var txt = "Hello World"
    println(txt[0]) // first element/character
    println(txt[2]) // third element/character

    //  string Length
    // A String in Kotlin is an object, which contain properties and
// functions that can perform certain operations on strings, by writing
// a dot character (.) after the specific string variable. For example,
// the length of a string can be found with the length property:


    println("String Length")
    var strTxt=  "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the String is : "+ strTxt.length)


    //  String Function
    println()
    println("String Functions")
   // There are many string functions available, for example toUpperCase() and toLowerCase():
    var Text = "Hello World"
    println(Text.uppercase())
    println(Text.lowercase())



    //  Comparing Strings
    //The compareTo(string) function compares two strings and returns 0 if both are equal:
    println("Comparing Strings")
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    println()
    // Finding a String in a String
    //The indexOf() function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
    var str=  "Please locate where 'locate '  occurs !"
    println(str.indexOf("locate"))//  output 7

    //  Remember that Kotlin counts positions from zero.
    //0 is the first position in a string, 1 is the second, 2 is the third ...

    println()
    println("Quotes Inside a String")
    // To use quotes inside a string, use single quotes ('):
    var textQ=  " It's alright"
    var textQ1= "That's great"
    println(textQ)
    println(textQ1)
    println()

    // String Concatenation
    println("String Concatenation")
    //he + operator can be used between strings to add them together to make a new string. This is called concatenation:
    var conStr1 =  "Mohd"
    var conStr2=  "Nabeel"
    println(conStr1+" "+ conStr2)

    //  Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
    //  You can also use the plus() function to concatenate two strings:
     var FirstName = "Asus"
    var lastName =  "Tuf15"
    println(FirstName.plus(lastName))


    // String Templates/Interpolation
    println()
    println("String Templates/Interpolation")
    // Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.
    //
    //Just refer to the variable with the $ symbol:

    var firstName =  "Asus Tuf "
    var SceondNAme =  "  Gaming F15"
    println("My Name is  $firstName $SceondNAme")

}

