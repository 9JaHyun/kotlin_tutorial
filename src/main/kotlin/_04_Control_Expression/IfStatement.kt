package _04_Control_Expression

import java.lang.IllegalArgumentException

// 자바랑 똑같다!! (차이점: void 없음, new 없음)
private fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

/**
 * 자바의 if-else: Statement -> 프로그램의 문장으로 하나의 값으로 도출되지 않음.
 *  - 자바에서는 이 때문에 삼항연산자를 제공해줌.
 * 코틀린의 if-else: Expression -> 하나의 값으로 반드시 도출되어야 함.
 */
private fun getPassOrFail(score: Int): String {
    // 코틀린의 if-else: Expression 이기 때문에 삼항연산자가 필요없다! (if-elseIf-else 역시 동일)
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

/**
 * 범위를 측정하는 기술
 *     - 자바에서 항상 꿈꾸었던 0 <= a <= 100 형태를 지원한다!
 *     - in을 사용하면 between 처럼 사용할 수 있다.
 *     - 부정표현을 사용하려면 앞에 ! 를 넣자
 */
private fun checkRange(score: Int): String {
    if (score !in 0..100) {
        throw IllegalArgumentException("점수는 0 ~ 100 사이 입니다.")
    }
    return "점수는 ${score}점 입니다."
}