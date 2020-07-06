package examples

/**
 * Function to check whether or not entered number
 * is a palindrome number.
 */

fun main() {
    println("///Program to check Palindrome Number///")
    println("\nEnter a Number: ")
    var enteredNumber: Int = Integer.valueOf(readLine())
    val palindrome = enteredNumber
    var a: Int
    var b = 0
    while (enteredNumber > 0) {
        a = enteredNumber % 10
        b = b * 10 + a
        enteredNumber /= 10
    }
    if (palindrome == b) {
        println("\nEntered Number $palindrome is a Palindrome Number.")
    }
    else {
        println("\nEntered Number $palindrome is not a Palindrome Number.")
    }
}
