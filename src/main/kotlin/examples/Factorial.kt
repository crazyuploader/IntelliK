package examples

fun main() {
    println("///Factorial Program///")
    println("\nEnter number: ")
    val number: Int = Integer.valueOf(readLine())
    var factorial = 1
    var i = 1
    while (i < number + 1) {
        factorial *= i
        i++
    }
    println("Factorial of $number is = $factorial")
}