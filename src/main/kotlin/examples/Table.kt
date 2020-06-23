package examples

/**
 * Function which takes a number as an input and displays its
 * multiplication table.
 */

fun main() {
    println("///Program to Display Multiplication Table///")
    println("\nEnter a Number: ")
    val number: Int = Integer.valueOf(readLine())
    var i = 1
    print("\n")
    while (i <= 10) {
        println("$number * $i = " + number * i)
        i++
    }
}
