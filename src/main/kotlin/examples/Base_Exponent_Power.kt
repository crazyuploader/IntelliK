package examples

fun main() {
    println("///Base Exponent Power Program///")
    println("\nEnter Base: ")
    var baseNumber: Int = Integer.valueOf(readLine())
    println("\nEnter Exponent: ")
    var exponentNumber: Int = Integer.valueOf(readLine())
    var i: Int = 1
    var finalNumber: Int = 1
    while (i <= exponentNumber)
    {
        finalNumber *= baseNumber
        i++
    }
    println("Answer: $finalNumber")
}