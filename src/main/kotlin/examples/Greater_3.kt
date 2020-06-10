package examples

/**
 * Function which takes three number as input
 * and displays the greatest one among them.
 */

fun main() {
    println("///Greater Number Program for 3 Numbers///")
    println("\nEnter First Number: ")
    val firstNumber: Int = Integer.valueOf(readLine())
    println("\nEnter Second Number: ")
    val secondNumber: Int = Integer.valueOf(readLine())
    println("\nEnter Third Number: ")
    val thirdNumber: Int = Integer.valueOf(readLine())
    var greatestNumber: Int
    if (firstNumber > secondNumber) {
        if (firstNumber > thirdNumber) {
            greatestNumber = firstNumber
        }
        else {
            greatestNumber = thirdNumber
        }
    }
    else {
        if (secondNumber > thirdNumber) {
            greatestNumber = secondNumber
        }
        else {
            greatestNumber = thirdNumber
        }
    }
    println("\nGreatest Number among $firstNumber, $secondNumber, and $thirdNumber is = $greatestNumber")
}