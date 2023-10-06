fun main(){
    //Define a lamdba expression to calculate the sum of two numbers
    val sum = { x: Int, y: Int -> x + y}

    //Example usage of the sum lambda
    val result1 = sum(5, 3)
    val result2 = sum(10, 20)

    //Display the results
    println("Result 1: $result1") //Output: Result 1: 8
    println("Result 2: $result2") //Output: Result 2: 30
}