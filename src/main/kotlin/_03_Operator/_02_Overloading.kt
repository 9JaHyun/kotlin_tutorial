package _03_Operator

fun main() {
    javaPlus()
    operatorOverLoading()
}

private fun javaPlus() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(1_000L)

    println(money1.plus(money2))
}

// 연산자를 직접 오버로딩 할 수 있다! (KotlinMoney 참고)
private fun operatorOverLoading() {

    val money1 = KotlinMoney(1_000L)
    val money2 = KotlinMoney(2_000L)

    println(money1.plus(money2))
    println(money1 + money2)    // 이게 되네??

}