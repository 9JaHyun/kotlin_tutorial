package _09_Inheritance

abstract class Animal(
    protected val species: String,

    // 오버라이드 허용 시 open을 붙여줘야 한다.
    protected open val legCount: Int
) {

    abstract fun move()
}