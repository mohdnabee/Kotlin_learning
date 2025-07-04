package code.Inhetance

class Offspring :  Secondary() , Archer, Singer{


    override fun archery() {
        super.archery()
        println("Archery skills enhanced by offspring ")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by offspring")
    }

       

}