package _10_Interface

import _09_Inheritance.Animal

// 인터페이스 구현은 상속과 방법이 똑같다
class Penguin2(
    species: String,
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount: Int = 2

    override fun move() {
        println("뒤뚱뒤뚱 걷기!")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        // 중복되는 인터페이스를 특정할 때는 super.act() 와 다르게 제네릭을 사용
        super<Swimable>.act()
        super<Flyable>.act()
    }

    // 이렇게 인터페이스에서 선언한 필드를 구현체에서 오버라이딩 해주어야 한다.
    override val swimAbility: Boolean
        get() = true
}