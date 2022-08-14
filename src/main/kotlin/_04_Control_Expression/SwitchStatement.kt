package _04_Control_Expression

/**
 * 코틀린의 Switch 를 대체할 수 있는 when 이 있다.
 *     - Java 17을 넘어가면서 Java 역시 다음과 같은 형태를 지원해준다.
 */
private fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"        // 조건부 -> 구문 을 쓰면 된다.
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

private fun getTypeNameWithSwitch(o: Any): String {
    return when (o) {
        is Int -> "Int!"
        is String -> "String!"
        is Long -> "Long!"
        else -> "cant read this type..."
    }
}

private fun multiValue(number: Int): String {
    return when (number) {
        -1, 0, 1 -> "음 어디서 많이 본 숫자네요"
        else -> "처음보는데요?"
    }
}

private fun ifInSwitch(number: Int) {
    when {  // when에 값이 없다면 조건문을 끼워넣을 수 있다.
        number == 1 -> println("1이네요")
        number % 2 == 0 -> println("짝수네요")
        else -> println("홀수네요")
    }
}