package _08_Class

import java.lang.IllegalArgumentException

// 필드 선언을 생성자에 넣을 수도 있다.
class Person5_Customizing_Setter(
    name: String,
    var age: Int = 1
) {

    // setter은 지양하기 때문에 잘 쓰이진 않는다.
    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    val isAdult: Boolean
        get() {
            return age >= 20
        }

}

fun main() {
    val person = Person4("홍길동", 20)

    // 셋 중 선택은 자유다.
    println(person.isAdultV1())
    println(person.isAdultV2)
    println(person.isAdultV3)
}