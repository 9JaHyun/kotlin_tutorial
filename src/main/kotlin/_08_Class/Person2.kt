package _08_Class

import java.lang.IllegalArgumentException

// 필드 선언을 생성자에 넣을 수도 있다.
class Person2(
    val name: String,
    var age: Int) {


    // 만약 생성자에 검증로직(나이는 0보다 커야 한다 등)을 넣고 싶으면 init을 사용하자
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }
}