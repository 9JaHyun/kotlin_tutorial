package _08_Class

// 형태는 record와 비슷하다.
// 생성자는 클래스네임 옆에! (이를 주 생성자라 하며 반드시 있어야 한다.)
class Person(name: String, age: Int) {

    val name = name
    var age = age

    // getter, setter은 자동으로 만들어 준다.
}