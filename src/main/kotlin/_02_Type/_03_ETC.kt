package _02_Type

import _01_Variable.Person

fun main() {
    interpolation()
}
/**
 * Any
 *   - 자바의 Object 역할을 함.
 *   - 자바와 달리 기본형 타입의 최상위 타입 역시 Any 이다! (모든 타입의 최상위타입!)
 *   - Any 자체로는 null을 포함할 수 없기 때문에 `?`를 추가로 붙여야 한다.
 *   - Any 에서는 Object와 마찬가지로 equals, hashCode, toString 를 지원한다.
 */

/**
 * Unit
 *     - 자바의 void 역할을 함.
 */

/**
 * Nothing
 *     - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현
 *     - 무조건 예외를 반환하는 함수 / 무한 루프 함수
 */

/**
 * String interpolation / String indexing
 *     - JS 처럼 EL 태그를 사용하는 방법이다.
 *     - 자바에서는 StringBuilder을 사용하거나 format을 사용했었다.
 */
fun interpolation() {
    val person = Person("홍길동")
    val sayHello = "이 사람의 이름은 ${person.name} 입니다."

    // 여러 문장을 작성할 때에는 """""".trimIndent() 을 사용하면 된다.
    val withoutIndent =
        """
            ABC
            123
            456
        """.trimIndent()
    println(sayHello)
    println(withoutIndent)
}