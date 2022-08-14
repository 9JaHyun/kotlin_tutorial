package _09_Inheritance

class Penguin(
    species: String,
) : Animal(species, 2) {

    private val wingCount: Int = 2

    override fun move() {
        println("뒤뚱뒤뚱 걷기!")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}