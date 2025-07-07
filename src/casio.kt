fun main (){
    var  calculator = "fx-82MS"
    var brand =  "Casio"
    var function =  240

    var edition =  "2th edition "
    var display = "2-line Display "
    var price = 625

    var year =  "08/2024"
    var warenety=  3
    var  discount   =  12.0
    var accesory =  "Comes with slides on hard cover"
    var totaldis=  price * (discount /  100.0)

    val  battery =  "DC 1.5v  == 0.0001w use battery  RO3, LR03 OR 'AAA' SIZE X1"
    val productid =  "4k2828lA"
    val productNumber =  "074-111636930"
    val id =  "S-V.P.A.M"
    val  company =  "Casio  computer CO,LTD MADE IN PHILIPPINES"
    val  coverId =  ">ps< 2-1"

    //  modes
    val Initialization =   "Shift +  mode(CLR) +  2(mode) "
    val  InitialixingCalc= "Shift +  mode(CLR) +  3(All) "
    val contrastSetting =  "Mode  +  mode      +  mode +mode +  2 (<count>) "


    println("calculator details")
    println("brand: " + brand + " "+ calculator)
    println("edition : "+edition)
    println("functions : "+ function)
    println("Display type : "+ display)
    println("accesory : "+ accesory)
    println("price : "+ price)
    println("Manufactured :" +year)
    println("Warenety :" +warenety + "  years ")
    println ("discount :" + discount + "%  =  "+ totaldis )
    println("Total price :" + price+ " - " + totaldis + " = "+  (price - totaldis))




    println()
    println("Additional  Details")
    println("Battery : $battery")
    println("Product ID : $productid")
    println("Product Number : $productNumber")
    println("ID : $id")
    println("Made by : $company")
    println("cover ID :  $coverId")


    println()
    println("modes")
    println("Initialization :   $Initialization")
    println("InitialixingCalc : $InitialixingCalc")
    println("contrastSetting :  $contrastSetting")
}