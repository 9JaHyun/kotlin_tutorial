package _05_Loop_Statement

fun main() {
    normalForStatement()
    progressiveForStatement()
}

// 기본적은 For 문
private fun normalForStatement() {

    // .. : 범위를 나타내는 연산자.
    for (number in 1..5) {
        println(number)
    }
}

// 감소하는 경우는?
private fun normalForStatement2() {

    for (number in 5 downTo 1) {
        println(number)
    }
}

// 1씩 올라가지 않는 경우?
private fun normalForStatement3() {

    // 2씩 올라가기
    for (number in 1..5 step 2) {
        println(number)
    }
}

// 향상된 For문
private fun progressiveForStatement() {
    
    val numbers = listOf<Int>(1, 2, 3, 4, 5)

    // : 대신 in 을 사용한다.
    for (number in numbers) {
        println(number)
    }
}

// while은 똑같다.
private fun whileStatement() {
    var i = 1
    while (i < 5) {
        println(i)
        i++
    }
}