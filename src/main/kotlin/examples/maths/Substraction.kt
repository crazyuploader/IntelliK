package examples.maths

/**
 * Function which takes two number as input, and displays
 * the difference between them.
 */

fun main() {
    println("///Program for Subtraction///")

    println("\nEnter First Number:")
    val firstNumber: Int = Integer.valueOf(readLine())

    println("\nEnter Second Number")
    val secondNumber: Int = Integer.valueOf(readLine())

    println("\nSubtraction of $firstNumber & $secondNumber is = " + (firstNumber - secondNumber))
}
