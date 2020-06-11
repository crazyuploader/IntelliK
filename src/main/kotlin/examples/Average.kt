package examples

/**
 * Program which takes n number of inputs,
 * and displays the average of them.
 */

fun main() {
    println("///Program to get average of n Entered Number")
    println("\nEnter of numbers to get Average: ")
    val size: Int = Integer.valueOf(readLine())
    var numbers = ArrayList<Int>()
    var i = 1
    while (i <= size) {
        println("\nEnter $i element: ")
        numbers.add(Integer.valueOf(readLine()))
        i++
    }
    i = 0
    var average = 0
    while (i < size) {
        average += numbers[i]
        i++
    }
    println("\nAverage of all Entered Number is = $average")
}