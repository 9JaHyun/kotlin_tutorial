package _07_Function_In_Kotlin

fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    // 배열을 가변인자로 쓰고 싶을때에는 *을 붙이자 (스프레드 연산자)
    printAll(*array)

}


// 가변인자의 경우에는 'vararg'를 앞에 붙이자.
private fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}