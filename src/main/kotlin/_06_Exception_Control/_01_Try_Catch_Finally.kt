package _06_Exception_Control

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {

}

private fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

// Try-Catch 역시 Expression 으로 간주된다! -> return으로 묶을 수 있음
private fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 굳이 Exception을 던지지 않아도 별 문제가 발생하지 않음.
// 왜냐하면 코틀린에서는 모두 [Unchecked Exception] 으로 간주하기 때문!! (Checked Exception만 Throw 사용)
// 그래서 사실상 메서드 레벨에서 throw를 볼 일이 없다.
private fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// Try-With-Resource
// 코틀린에서는 따로 없음. 대신 각 유틸리티마다 확장 메서드를 사용해서 사용할 수 있다.
// 보통 .use()를 제공해준다. (코틀린 언어적 특성)
private fun readFileV2(path: String) {
    val reader = BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}