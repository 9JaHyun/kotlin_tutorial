package _03_Operator

import _01_Variable.Person

/**
 * JS와 다르게 === 이 동일성을 비교하고
 * == 이 동등성을 비교한다.
 */

fun main() {
    equalsAndSame()
}

fun equalsAndSame() {
    val hong1 = Person("홍길동")
    val hong2 = Person("홍길동")
    val hong3 = hong2

    println("hong1 === hong2 : ${hong1 === hong2}")
    println("hong2 === hong3 : ${hong2 === hong3}")
    println("hong1 == hong2: ${hong1 == hong2}")
    println("hong2 == hong3: ${hong2 == hong3}")
}