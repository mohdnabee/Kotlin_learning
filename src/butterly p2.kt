fun  main (){

    val  n=5

    //  upper half
    for(i in 1..n){
        // left start
        for (j in  1..i){
            print("* ")
        }

        // spaces
        for (j in 1..2*(n-i)){
            print("  ")
        }


        // Right start
        for (j in  1..i){
            print("* ")
        }
        println()

    }


    //  lower half

    for (i in n downTo 1){
        // left stars
        for (j  in  1..i){
            print("* ")
        }

        // spaces
        for (j in 1..2*(n-i)){
            print("  ")
        }

        // right stars
        for (j in 1..i){
            print("* ")
        }

        println()
    }





}