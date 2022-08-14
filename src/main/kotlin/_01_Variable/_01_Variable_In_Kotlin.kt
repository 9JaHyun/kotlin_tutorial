package _01_Variable

class _01_Variable_In_Kotlin {

    fun main() {
        // 기본적으로 접근 제한자가 붙지 않으면 public이다.
        // 가변은 var(variable), 불변은 val(value)을 사용하자.
        var publicString = "Hello";
        publicString = "a";

        val publicFinalString = "Hello";
//        publicFinalString = "new Hello";  // 불변이기 때문에 컴파일 에러 발생


        /*
        기본형 타입
         */
        // 기본적으로 타입 추론을 사용하고 있지만 명시적으로 사용하려면 콜론을 사용하자.
        var publicStringInference = "Inference Hello"
        var publicStringExplicit: String = "Explicit Hello"

        // 기본형 타입의 경우에는 오토박싱을 고려하지 않아도 된다.
        val number1: Long = 10L

        // Kotlin은 기본적으로 null을 할당할 수 없음.
//        val number2: Long = null;
        // null을 넣고 싶으면 타입 뒤에 `?` 을 붙여줘야 함.
        val canNull: Long? = null


        /*
        객체 타입
         */
        // 코틀린은 new 키워드를 사용하지 않는다.
        val person = Person("Kim")
    }
}