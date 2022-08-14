package _09_Inheritance

// 상속 시 ' : ' 사용
// 추가로 super() 처럼 뒤에 파라미터를 넣어 상위 클래스 생성자를 불러주자.
class Cat(
    species: String,
    ) : Animal(species, 4){

    // override 시 예약어를 붙여주자.
    override fun move() {
        println("야옹 사뿐사뿐 걷기")
    }
}