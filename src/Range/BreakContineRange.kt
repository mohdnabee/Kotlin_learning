package Range

// Break or Continue a Range
//You can also use the break and continue keywords in a range/for loop:
fun main(){
    //  Example
    //Stop the loop when nums is equal to 10:

    println("Break in 10 ")
    for (nums in 5..15){
        if (nums ==  10 ){
            break
        }
        println(nums)
    }

    //  continue
    println()
    // Skip the value of 10 in the loop, and continue with the next iteration:

    println("continue in 12 ")
    for (nums2 in 5..14){
        if (nums2 ==  12){
            continue
        }
        println(nums2)
    }

}