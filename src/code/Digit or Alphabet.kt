package code

fun  main (){
     val  ch  =  '8'

    when  {
        ch in  '0'..'9' ->  println("$ch  is a Digit")
        ch  in  'a'..'z' ->  println("$ch  is  an  Alphabet")

        else->  println("$ch  is a Special  Character ")
    }

}