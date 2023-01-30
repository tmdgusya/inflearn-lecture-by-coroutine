package chapter01

class Calculator {

    fun add(a: Int, b: Int) = a + b

    fun multiply(a: Int, b: Int) = a * b
}

fun isHello(input: String) = input == "Hello"

fun numToString(num: Int) = when (num) {
    1 -> "1"
    2 -> "2"
    3 -> "3"
    4 -> "4"
    5 -> "5"
    else -> "IDK"
}