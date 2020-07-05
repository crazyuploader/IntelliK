package examples

/**
 * Function to test whether or not entered number is
 * an Armstrong Number.
 */

fun main() {
    println("///Program to check for Armstrong Number///")
    println("\nEnter a Number: ")
    val number: Int = Integer.valueOf(readLine())
    var temp = number
    var total = 0
    var a = 0
    while (temp > 0) {
        a = temp % 10
        total += (a * a * a)
        temp /= 10
    }
    if (total == number) {
        println("\nEntered Number $number is an Armstrong Number.")
    }
    else {
        println("\nEntered Number $number is not an Armstrong Number.")
    }
}
