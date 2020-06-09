package examples

fun main() {
    println("///Greater Number Program///")
    println("\nEnter First Number: ")
    val firstNumber: Int = Integer.valueOf(readLine())
    println("\nEnter Second Number: ")
    val secondNumber: Int = Integer.valueOf(readLine())
    var greatestNumber = 0
    if (firstNumber > secondNumber) {
        greatestNumber = firstNumber
    }
    else {
        greatestNumber = secondNumber
    }
    println("\nGreater Number between $firstNumber & $secondNumber is = $greatestNumber")
}