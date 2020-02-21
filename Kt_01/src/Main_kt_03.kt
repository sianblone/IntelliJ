import java.util.*
import kotlin.system.measureTimeMillis

fun main() {
    println("------------main fun------------")
    cases(1)
    cases("Hello")
    cases(2)
    cases(System.currentTimeMillis())
    cases("ㅁㄴㅇ")
    cases(Main_01())
}

// 새로운 함수 선언
// public void cases(Object obj)
fun cases(obj : Any) { // 자바의 Object = 코틀린의 Any
    when(obj) {
        1 -> println("숫자: 1")
        "Hello" -> println("문자열 Hello: ${obj}")
        is Int -> println("정수형 숫자: ${obj}")
        is Long -> println("Long형 숫자: ${obj}")
        is String -> println("문자열: ${obj}")
        !is String -> println("문자열이 아님: ${obj}")
        else -> println("기타: ${obj}")
    }
}