package _07_Function_In_Kotlin

private fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

/**
 * V2: 컬리브레이스를 = 으로 변환하기
 *     - 위의 문법처럼 하나의 결과문이라면 = 으로도 표시할 수 있다!
 *     - 블록을 제외하는 것을 생각하자.
 */
private fun maxV2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

/**
 * 타입 추론 + 컬리 브레이스 제거하기
 *     - 정말 리턴 타입이 명확한 경우에는 타입 추론을 해주기 때문에 타입 명시를 하지 않아도 된다.
 *     - 만약 블록을 사용하는 경우에는 타입을 명시적으로 작성해야 한다.
 *
 *     - a, b 역시 여러 구문이 들어가는 것이 아니라 값 하나만 들어가기 때문에 생략이 가능하다
 */

private fun maxV3(a: Int, b: Int) = if(a > b) a else b

