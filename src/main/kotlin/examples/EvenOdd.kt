package examples

/**
 * Function which takes a number and displays
 * whether the entered number is an odd or even.
 */

fun main() {
    println("///Even Odd program///")
    println("\nEnter Number: ")
    val number: Int = Integer.valueOf(readLine())
    if (number / 2 == 0) {
        println("\n$number is an even number")
    }
    else {
        println("\n$number is an odd number")
    }
}