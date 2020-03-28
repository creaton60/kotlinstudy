package net.book.study.kotlin.ch1

/**
 * 순수하지 못한 함수 예제
 * 외부 변수 수정
 */
fun main() {
    //k is 10

    println(impureFunctionWithSideEffect(1, 2)) // 3 output but k 2
    println(impureFunctionWithSideEffect(1, 2)) // 4 output but k 2
}

var k = 10

//side effect function
fun impureFunctionWithSideEffect(x: Int, y: Int): Int {
    k = y
    return x + y
}