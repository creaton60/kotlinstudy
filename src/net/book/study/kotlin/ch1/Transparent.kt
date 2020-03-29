package net.book.study.kotlin.ch1

fun main() {
    val result = transparent("Joe")
    print(result)
}

fun transparent(name: String): String {
    return "Hello $name"
}

fun print(helloStr: String) {
    println(helloStr)
}