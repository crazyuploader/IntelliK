package examples

/**
 * Function to test whether or not entered number is a prime
 * number.
 */

fun main() {
    println("///Program to check Prime Number///")
    println("\nPlease enter a number: ")
    val number: Int = Integer.valueOf(readLine())
    var i = 1
    var count = 0
    while (i <= number) {
        if (number % i == 0) {
            count++
        }
        i++
    }
    if (count == 2) {
        println("\n$number is a Prime Number.")
    }
    else {
        println("\n$number is not a Prime Number.")
    }
}