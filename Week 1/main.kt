fun main () {
    // Integer data types
    val byteValue: Byte = 42
    val shortValue: Short = 100
    val intValue: Int = 1000
    val longValue: Long = 1000000000L // Note the 'L' suffix for Long literals

    // Floating-point data types
    val floatValue: Float = 3.14f // Note the 'f' suffix for Float literals
    val doubleValue: Double = 2.71828

    // Boolean data type
    val isKotlinAwesome: Boolean = true

    // Character data type
    val grade: Char = 'A'

    // String data type
    val greeting: String = "Hello, Kotlin!"

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val fruits: Array<String> = arrayOf("Apple", "Banana", "Cherry")

    // Nullable data types
    val nullableValue: String? = null

    println("Byte: $byteValue")
    println("Short: $shortValue")
    println("Int: $intValue")
    println("Long: $longValue")
    println("Float: $floatValue")
    println("Double: $doubleValue")
    println("Boolean: $isKotlinAwesome")
    println("Char: $grade")
    println("String: $greeting")
    println("IntArray: ${numbers.joinToString()}")
    println("Array<String>: ${fruits.joinToString()}")
    println("Nullable Value: $nullableValue")

}