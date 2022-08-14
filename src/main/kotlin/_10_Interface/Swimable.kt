package _10_Interface

interface Swimable {

    // 이렇게 인터페이스에서 필드를 만들 수 있다. (단, Backing field 는 없다)
    val swimAbility: Boolean

    fun act(){
        println("어푸 어푸")
    }
}