package examples

fun main() {
    println("///Factorial Program///")
    println("\nEnter number: ")
    val number: Int = Integer.valueOf(readLine())
    var factorial: Int = 1
    var i: Int = 1
    while (i < number + 1) {
        factorial *= i
        i++
    }
    println("Factorial of $number is = $factorial")
}