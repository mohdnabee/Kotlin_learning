fun main(){
     //  Kotlin Operators
    //Operators are used to perform operations on variables and values.
    //
    //The value is called an operand, while the operation (to be performed between the two operands) is defined by an operator:

    var x =  10+5
    println(x)

     // example 2
    var num1 =  100 +50
    var num2 =  num1 +35
    var num3 =  num2 + 45

    println ( num1)
    println(num2)
    println(num3)

    /*
    Kotlin divides the operators into the following groups:

      Arithmetic operators
     Assignment operators
      Comparison operators
     Logical operators
     */

    println()
    println("Arithmetic operators =  +, -,*,/ ,%, ++,--")
    //  Arithmetic operators =  +, -,*,/ ,%, ++,--
    var a =  5
    var b = 6
    var addition =  a+b
    var sub =  a-b
    var mul =  a * b
    val div =  a/b
    val   modulus =  a % b
    val  incre =   ++a
    val dec =  --x

    println("add: "+ addition + ", sub: "+sub + " ,mul: "+mul + " ,div : "+div+ " ,modulus :" + modulus + " ,incerment: "+ incre+ " ,decrement : "+dec)

    println()
    println( "kotlin Assignment operators :")

    //  kotlin Assignment operators :

    //Assignment operators are used to assign values to variables.
    //
    //In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:

    println(" The addition assignment operator (+=) adds a value to a variable:")
    var addx= 10
    addx +=  5
    println(addx)

    println("operator = (=)")
    var r=  5  ;
    println(r)

    println("operator = (-=) ")
  var example =  5
    example -= 3
    println(example)

    println("operator = (*=)")
    var multi =  3
     multi *= 5
    println(multi)

    println("operator =  (/=)")
    var divideOpe=  4
    divideOpe /= 2
    println("divide :"+ divideOpe)

    println("operators =  (%=)")
    var modOpr=  10
    modOpr %=  3
    println(modOpr)
    println()


    //  Kotin Kotlin Comparison Operators
    println("Kotlin Comparison Operators")

    var v1 =  5
    var v2 =  3

    println("==	Equal to	x == y")// returns false because 5 is not equal to 3
    println("v1 ==  v2 : "  + (v1==v2) )

    println("!=	Not equal	x != y")
    println("v1 !=  v2 : "  + (v1!=v2) )

    println(">	Greater than	x > y")
    println("v1 >  v2 : "  + (v1>v2) )

    println(" <	Less than	x < y")
    println("v1 <  v2 : "  + (v1<v2) )

    println(" >=	Greater than or equal to	x >= y")
    println("v1 >=  v2 : "  + (v1>=v2) )

    println("<=	Less than or equal to	x <= y")
    println("v1 <=  v2 : "  + (v1<=v2) )
    println()

    //  Kotlin Logical Operators

    println("Kotlin Logical Operators")
    //Logical operators are used to determine the logic between variables or values:
println("Operator\tName\tDescription\tExample\tTry it\n" +
        "&& \tLogical and  \tReturns true if both statements are true\tx < 5 &&  x < 10\t\n" +
        "|| \tLogical or   \tReturns true if one of the statements is true\tx < 5 || x < 4\t\n" +
        "!\tLogical not  \tReverse the result, returns false if the result is true\t")

    println()
    var x1 = 5
    println( "Logical AND "+"x > 3 && x < 10 :"+(x1 > 3 && x1 < 10))
    println("Logical or "+"x1 > 3 || x1 < 4 :"+(x1 > 3 || x1 < 4) )// returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
    println("Logical not :")
    var myBool = true
    println(!myBool)

}