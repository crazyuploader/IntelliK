package examples.maths

/**
 * Function to perform division mathematical operation
 * on two entered numbers.
 */

fun main() {
    println("///Division Program")

    println("\nEnter First Number")
    val firstNumber: Int? = Integer.valueOf(readLine())

    println("\nEnter Second Number")
    val secondNumber: Int? = Integer.valueOf(readLine())

    println("\n$firstNumber divided by $secondNumber is = " + firstNumber!! / secondNumber!!)
}
