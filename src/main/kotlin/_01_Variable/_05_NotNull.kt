package _01_Variable

// 절대 Null이 아니라고 단언할 수 있는 경우 !!을 사용한다.
fun notNullFun(str: String?): Boolean {
    // 절대 Null이 될 수 없다면..?.
    return str!!.startsWith("A")
}

// 플랫폼 타입
// Kotlin에서 Java 코드를 가져다 사용할 때 어떻게 처리될까?
fun nullableCase() {
    val person = Person("Kim")
//    startWithA(person.name) // <- @Nullable 때문에 작동 안됨 (꼭 써주자)

    // 해결책 1. @Nullable 를 @NotNull로 바꾸던가...

    // 결론 => 자바에서 코드를 가져다 쓰려면 @Nullable, @NotNull을 꼭 기입하자.

}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}