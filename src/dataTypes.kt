import com.sun.jdi.Value

fun main(){

    println("Kotlin Data Types ")
    val myNum = 5               // Int
    val myDoubleNum = 5.99      // Double
    val myLetter = 'D'          // Char
    val myBoolean = true        // Boolean
    val myText = "Hello"        // String

    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    println()
    val myNum1: Int = 5                // Int
    val myDoubleNum2: Double = 5.99    // Double
    val myLetter3: Char = 'D'          // Char
    val myBoolean4: Boolean = true     // Boolean
    val myText5: String = "Hello"      // String
    println(myNum1)
    println(myDoubleNum2)
    println(myLetter3)
    println(myBoolean4)
    println(myText5)


    println()
    val number: Byte =  100
    println(number)

    val numberShort : Short =  5000
    println(numberShort)

    val numberInteger :  Int =  10000
    println(numberInteger)

    val numberLong :  Long =  15000000L
    println(numberLong)

    // Difference Between Int and Long
    //A whole number is an Int as long as it is up to 2147483647.
// If it goes beyond that, it is defined as Long:


    //val myNum1 = 2147483647  // Int
    //val myNum2 = 2147483648  // Long

    /*
    Floating Point Types
Floating point types represent numbers with a decimal, such as 9.99 or 3.14515.

The Float and Double data types can store fractional numbers:
     */

    println()
    println("Float example")

    val  numFloat :  Float = 5.57F
    println(numFloat)

    println()
    println("Double Example")

    val numDouble: Double = 19.99
    println(numDouble)

    //  Scientific Numbers
    //  a floating pont number can also be a scientific number with an "e" or "E'
    //  to Indicate the power of 10:

    //  example
    println()
    println("Scientific Numbers ")
    val sNum : Float =  35E3F
    val SNum2:  Double =  12E4
    println(sNum)
    println(SNum2)

     println()
//  booleans
    //  The booleans data type can only take the values true or false :
    //  example
    println("Boolean  =  true or False:")

    val isKotlinFun : Boolean=  true
    val isFishTasty :  Boolean = false
    println(isKotlinFun) //  outputs true
    println(isFishTasty)//  outputs false


    //  Characters :
    /*
    The Char data type is used to store a single character. A char value must be
    surrounded by single quotes, like 'A' or 'c':
     */

    println()
    println("Characters :")
    val myGrade :  Char =  'B'
    println(myGrade)

    //  strings kotlin
    /*
    The String data type is used to store a sequence of characters (text).
    String values must be surrounded by double quotes:
     */
    println()
    //  example

    println("Strings Kotlin: ")
    val myStr : String ="This Is String "
    println(myStr)


    // type conversion
    /*Type conversion is when you convert the value of one data type to another type.

In Kotlin, numeric type conversion is different from Java. For example, it is not
possible to convert an Int type to a Long type with the following code:
     */

    /*
    println()
    println("Type Conversion Kotlin ")
    val X : Int =  5
    val Y : Long =  X
    println(y) //  Error Type mismatch  */

    //  To convert a numeric data type to another type, you must use one of the following functions:
//  toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    val x :  Int =  5 ;
    val y : Long =  x.toLong()
    println(y)

}
