package code

import java.awt.Color

fun  main  (){


    val  blueRoseVase =  Vase("Blue","Rose")
    val  redRoseVase =  blueRoseVase.copy(color = "Red")

    println(blueRoseVase )
    println(redRoseVase)
}


data class Vase (val  color: String ,  val  design: String){

}
