package net.book.study.kotlin.ch1

/**
 * 순수하지 못한 함수 예제
 * 외부 변수 참조
 */
fun main() {
    println(impureFunction(1, 2)) // 13 output
    z=20
    println(impureFunction(1, 2)) // 23 output
}

var z = 10

//not pure function
fun impureFunction(x: Int, y: Int): Int = x + y + z