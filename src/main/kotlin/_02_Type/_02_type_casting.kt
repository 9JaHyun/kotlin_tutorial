package _02_Type

import _01_Variable.Person

fun main() {
    typeCasting2(null)
}

// 1. 기본형 타입 변환: 코틀린에서 타입변환은 명시적으로 이루어져야 한다.
// 자바에서는 오버플로우를 막기 위해 더 큰 타입으로 암시적 변경이 일어남.
fun typePromotion() {
    val number1: Int? = 5
//    val number2: Long = number1 // 이렇게 변경이 불가능함.
    val number2: Long = number1?.toLong() ?: 0 // to변환타입()을 사용하자

}

// 2. 참조형 타입 변환 (타입 캐스팅)
fun typeCasting(obj: Any) {
    // is: instanceOf와 같음
    if (obj is Person) {
        // as Person: (Person)과 같음
        val person = obj as Person

        // 사실 is(타입 체크)를 했다면 굳이 as(타입캐스팅)를 안해도
        // 자동으로 타입 캐스팅이 된다.
//        val person = obj
        println(person.name)
    }

    // instanceOf 반대의 경우에는 is 앞에 느낌표 표기
    if (obj !is Person) {
        println("Person 타입이 아닙니다!")
    }
}

// 2-1. Null의 가능성이 있는 참조형 타입 변환 (타입 캐스팅)
fun typeCasting2(obj: Any?) {
    // as 뒤에 ? 를 붙이면 obj의 null이나 타입 일치 여부를 파악해 캐스팅을 할지 null을 반환할지 결정.
    // 덕분에 예외 발생이 일어나지 않는 안전한 타입 변환을 만들 수 있다.
    val person = obj as? Person
    println(person?.name) // null이 될 수 있기 때문에 person 뒤에 물음표를 넣자.
}