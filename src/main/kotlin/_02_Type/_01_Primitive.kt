package _02_Type

fun main() {
    typeChecking()
}

// 1. 기본타입: 선언된 기본 값을 보고 자동으로 추론
fun typeChecking() {
    val number1 = 3
    val number2 = 1L
    val str1 = "문장입니다."

    println(number1.javaClass.typeName)
    println(number2.javaClass.typeName)
    println(str1.javaClass.typeName)
}

