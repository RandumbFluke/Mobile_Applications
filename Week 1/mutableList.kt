fun main(){
    //Create a mutable list of integers
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

    //Add an element to the mutable list
    mutableList.add(6)

    //Modify an element in the list
    mutableList[0] = 10

    //Remove an element from the list
    mutableList.removeAt(3)

    //Print the modified lsit
    println("Modified List: $mutableList")
}