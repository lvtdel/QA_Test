package org.example

fun average(value: Array<Int>, minimum: Int, maximum: Int): Int {
    var i = 0;
    var inputNumber = 0
    var validNumber = 0
    var sum = 0
    var average: Int

    while ((value[i] != -999) && inputNumber < 100) {
        inputNumber++
        if ((value[i] >= minimum) && (value[i] <= maximum)) {
            validNumber++
            sum += value[i]
        } else continue

        i++
    }

    if (validNumber > 0)
        average = sum / validNumber
    else
        average = -999

    return average
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, -999, 9)
    val min = 1
    val max = 8

    print(average(arr, min, max))
}