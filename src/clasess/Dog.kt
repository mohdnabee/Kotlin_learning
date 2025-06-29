package clasess

class Dog( var name : String , var breed : String,  var  age :Int =0) {

    init {
        bark(name)
    }

    fun  bark  (name : String) {
        println("$name Says woof! woof!")
    }

}
