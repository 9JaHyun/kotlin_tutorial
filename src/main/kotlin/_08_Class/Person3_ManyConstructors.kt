package _08_Class

import java.lang.IllegalArgumentException

// 필드 선언을 생성자에 넣을 수도 있다.
class Person3_ManyConstructors(
    val name: String,
    var age: Int) {


    // 만약 생성자에 검증로직(나이는 0보다 커야 한다 등)을 넣고 싶으면 init을 사용하자
    init {
        println("생성 전 검증 로직 호출")
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    // 생성자를 한번 더 만드려면?
    // 기존 생성자에 오버로딩을 하는 것이기 때문에 클래스 내부에 constructor을 사용하자
    constructor(name: String): this(name, 1){ // 첫 번째 부 생성자 -> 주 생성자 호출
        println("첫 번째 부 생성자 입니다.")
    }

    constructor(): this("홍길동"){ // 두 번째 부 생성자 -> 첫 번째 부 생성자 호출
        println("두 번째 부 생성자 입니다.")
    }

    // => 사실 이런걸 쓰느니 정적 팩토리를 써라
}

fun main() {
    Person3_ManyConstructors()
//    Person3_ManyConstructors("홍길동")
}