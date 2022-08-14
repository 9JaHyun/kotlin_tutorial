package _01_Variable

import java.lang.IllegalArgumentException

// 근데 위의 과정이 너무 귀찮다! 이를 한번에 해줄 방법이 없나?
// Kotlin에서는 Null일 경우 메서드를 실행하지 않는 기능인 Safety Call을 제공하고 있다.
fun safeCall() {
    val str: String? = null

//        print(str.length); // <- 불가능!
    // `.` 대신 `?.`을 입력하면 된다.
    print(str?.length);
}


