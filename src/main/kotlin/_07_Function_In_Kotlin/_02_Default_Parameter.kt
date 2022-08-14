package _07_Function_In_Kotlin

import java.util.StringJoiner

fun main() {
    repeat("hello!")

    // 만약 횟수는 3회를 유지하고 개행만 false 쓰고 싶다면??
    // 파라미터를 명시하면 된다! 이를 'named argument' 라고 한다.
    repeat("hello2", useNewLine = false)

    printNameAndGender(name = "홍길동", gender = "남자")
}

// 파라미터에 기본값을 부여할 수 있다.
private fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// 단 자바로 생성한 언어로는 이를 사용할 수 없다.
private fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}