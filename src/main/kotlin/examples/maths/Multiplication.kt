package examples.maths

fun main() {
    println("///Multiplication Program///")

    println("\nEnter First Number")
    val firstNumber: Int? = Integer.valueOf(readLine())

    println("\nEnter Second Number")
    val secondNumber: Int? = Integer.valueOf(readLine())

    println("\nProduct of $firstNumber & $secondNumber is = " + firstNumber!! * secondNumber!!)
}