package net.book.study.kotlin.ch1

fun main() {
    println(impureFunctions(1, 2))
    println(withSideEffect(10, 20))
    println(impureFunctions(1, 2))
}

var w = 10

fun impureFunctions(x: Int, y: Int): Int = x + y + w

fun withSideEffect(x: Int, y: Int): Int  {
    w = y
    return x + y
}
