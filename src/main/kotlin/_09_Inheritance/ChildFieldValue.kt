package _09_Inheritance


fun main() {
    Parent(100)
    println()
    println()
    Child(500)
}


open class Parent(
    open val number: Int = 200
) {
    init {
        println("=== Parent Class ===")
        // 상위 클래스에서 하위 클래스가 override 하고 있는 프로터피를 생성자, init에서 사용하면 안된다.
        // 그냥 생성자 초기화 블록에 사용되는 프로퍼티는 open 키워드를 사용하지 말자.
        println(number) // 아직 Child에서 초기화가 이루어지지 않았기 때문에 0 출
        println("===================")
    }
}

class Child(
    override val number: Int
) : Parent(number) {
    init {
        println("=== Child Class ===")
        println(number)
        println("===================")
    }
}