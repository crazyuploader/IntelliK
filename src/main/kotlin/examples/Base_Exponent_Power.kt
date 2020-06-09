package examples

/**
 * Function taking two inputs; a base and an exponent
 * number, calculates the result and displays them.
 */

fun main() {
    println("///Base Exponent Power Program///")
    println("\nEnter Base: ")
    val baseNumber: Int = Integer.valueOf(readLine())
    println("\nEnter Exponent: ")
    var exponentNumber: Int = Integer.valueOf(readLine())
    var result = 1
    while (exponentNumber != 0)
    {
        result *= baseNumber
        exponentNumber--
    }
    println("\nAnswer: $result")
}