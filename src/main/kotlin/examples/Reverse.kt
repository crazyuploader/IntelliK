package examples

fun main() {
    println("///Program to Reverse an Entered Number///")
    println("\nEnter a Number: ")
    var enteredNumber: Int = Integer.valueOf(readLine())
    var reversedNumber = 0
    var temp: Int
    while (enteredNumber > 0) {
        temp = enteredNumber % 10
        reversedNumber = reversedNumber * 10 + temp
        enteredNumber /= 10
    }
    println("\nReversed Number = $reversedNumber")
}