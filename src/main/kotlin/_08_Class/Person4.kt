package _08_Class

import java.lang.IllegalArgumentException

// 필드 선언을 생성자에 넣을 수도 있다.
class Person4(
    val name: String,
    var age: Int
) {

    // 만약 생성자에 검증로직(나이는 0보다 커야 한다 등)을 넣고 싶으면 init을 사용하자
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    fun isAdultV1(): Boolean {
        return this.age >= 20
    }

    // 프로퍼티 처럼 보이게 하는 Custom getter 사용
    val isAdultV2: Boolean
        get() = this.age >= 20

    // 컬리 브레이스도 가능!
    val isAdultV3: Boolean
        get() {
            return this.age >= 20
        }
}

fun main() {
    val person = Person4("홍길동", 20)

    // 셋 중 선택은 자유다.
    println(person.isAdultV1())
    println(person.isAdultV2)
    println(person.isAdultV3)
}