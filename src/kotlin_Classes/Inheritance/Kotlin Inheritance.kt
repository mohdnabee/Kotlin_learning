package kotlin_Classes.Inheritance

//  Kotlin Inheritance (Subclass and Superclass)
//In Kotlin, it is possible to inherit class properties and functions from one class to another. We group the "inheritance concept" into two categories:
//
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//In the example below, MyChildClass (subclass) inherits the properties from the MyParentClass class (superclass):

//  example

//  superClass
open  class MyParentClass{
    val x =5
}

 //  subclass
class MyChildClass: MyParentClass(){
     fun  myFunction(){
         println(x) //  x is defined in the superclass
     }
}

//  create an object of the MyChildClass and call  myFunction

fun main(){
    val myobj = MyChildClass()
    myobj.myFunction()
}

//  Example Explained
//Use the open keyword in front of the superclass/parent, to make this the class other classes should inherit properties and functions from.
//
//To inherit from a class, specify the name of the subclass, followed by a colon :, and then the name of the superclass.
//
//Why And When To Use "Inheritance"?
//- It is useful for code reusability: reuse properties and functions of an existing class when you create a new class.