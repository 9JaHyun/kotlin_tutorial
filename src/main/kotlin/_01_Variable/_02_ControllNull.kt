package _01_Variable

import java.lang.IllegalArgumentException

fun main() {
    println(elvisFun(null))
}

// 메서드 반환타입 역시 : Boolean
fun startWithA1V1(str: String?): Boolean {
    // 기본적으로 kotlin에서는 NPE 때문에 바로 해당 예외가 터질만한 메서드들은 바로 실행하지 못하게 한다.
//        str.startsWith("A");  // 에러!!

    // 그래서 앞에서 이런 상황에 대한 예외 처리를 해줘야 쓸 수 있다.
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startWithA2V1(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startWithA3V1(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun elvisFun(number: Long?): Long {
    return number ?: 0
}

fun changeVar1() {
    var number: Int = 1  // 변경 가능
    val number2: Int = 2 // 변경 불가능

    number = 2
}
