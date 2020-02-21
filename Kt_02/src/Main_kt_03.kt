import kotlin.math.ln

fun main() {
    sub("무명", "010-2222-2222")
    sub("이름")
}

/*
메소드를 선언하면서 매개변수 2개 생성
하나는 default값을 설정
 */
fun sub(name:String, tel:String="default value") {
    if(tel.equals("default value")) {
        println("이름만 전달받음 : ${name}, 전화 : ${tel}")
    } else {
        println("이름 : ${name}, 전화 : ${tel}")
    }
}