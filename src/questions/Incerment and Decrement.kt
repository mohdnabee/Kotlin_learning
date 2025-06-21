package questions

fun main (){
    var points =  105


    if (points % 7 == 0) {
        points = points + 50
    }
    if (points % 3 == 2) {
        points = points - 25
    }
    if (points % 5 == 4) {
        points = points * 2
    }
    if (points % 2 == 1) {
        points = points / 2
    }
    println("Final Points:  $points")
    }

