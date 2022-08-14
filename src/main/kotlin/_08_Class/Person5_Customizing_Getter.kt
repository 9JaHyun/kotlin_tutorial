package _08_Class

import java.lang.IllegalArgumentException

// 필드 선언을 생성자에 넣을 수도 있다.
class Person5_Customizing_Getter(
    name: String,
    var age: Int = 1
) {

    // custom getter을 생성하기 위해 primary 생성자에서 선언 X
    val name = name
//        get() = name.uppercase() // Person.name 자체가 getter 호출이다. 결국 무한루프를 발생!.
        get() = field.uppercase()  // 이를 막기 위해 자기 자신을 가르키는 field 라는 예약어를 생성.
                                    // 이를 backing field라고 함.

    // 사실 위의 방법은 그냥 생성자에서 선언한 후 this.name 을 사용해도 된다. (backing field를 잘 사용 X)

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