package _01_Variable

import java.lang.IllegalArgumentException

// Null 대신 다른 값을 던져주지는 못하나? (like Optional 클래스)
// Elvis 연산자기 있다!
// 주절주절: ?:을 90도로 돌리면 엘비스 헤어스타일 + 눈동자가 보인다고...
fun elvis() {
    val str: String? = null
    print(str?.length ?: 1) // str?.length의 결과가 Null이면 1을 반환
}

// 그럼 위의 세 메서드를 변경해보자
fun startWithA1V2(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어있습니다.")
}

fun startWithA2V2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3V2(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}