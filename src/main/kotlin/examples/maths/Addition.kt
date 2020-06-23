package examples.maths

/**
 * Simple function which takes two number as input,
 * adds them, and displays the result.
 */

fun main() {

    println("///Addition Program///")

    println("\nEnter First Number: ")
    val firstNumber: Int? = Integer.valueOf(readLine())
    println("\nEnter Second Number: ")
    val secondNumber: Int? = Integer.valueOf(readLine())

    println("\nAddition of $firstNumber & $secondNumber is = " + (firstNumber!! + secondNumber!!))
}
