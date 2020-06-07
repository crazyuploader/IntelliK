package examples

fun main() {
    println("///Greater Number Program///")
    println("\nEnter First Number: ")
    val firstNumber: Int = Integer.valueOf(readLine())
    println("\nEnter Second Number: ")
    val secondNumber: Int = Integer.valueOf(readLine())
    if (firstNumber > secondNumber) {
        println("\nGreater Number between $firstNumber & $secondNumber is = $firstNumber")
    }
    else {
        println("\nGreater Number between $firstNumber & $secondNumber is = $secondNumber")
    }
}