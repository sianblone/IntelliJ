fun main() {

    // val로 선언하는 변수는 final 변수(상수) 선언과 같다
    // 최초 한 번만 값을 할당할 수 있고 이후에는 값을 변경할 수 없다
    val name = "무명"

    // 1부터 10까지 반복하는 반복문
    for(num in 1..10) {
        // 1 <= num <= 10 : 1~10
        println("num in 1..10 : ${num}")
    }


    for(num in 1 until 10) {
        // 1 <= num < 9 : 1~9
        println("num in 1 until 10 : ${num}")
    }

    for(num in 10 downTo 1 step 3) { // 역순 계산. 조건에 (num in 10..1) 은 되지 않는다
        println("num in 10 downTo 1 step 1 : ${num}")
    }



    // ------------------ 응용 ------------------
    var start = 0
    var end = 10
    var sum = 0

    for(num in start..end) {
        sum += num
    }
    println("${start}부터 ${end}까지 숫자의 합 : ${sum}")

    // 0부터 100까지의 숫자중 짝수만 더하고 싶을 때
    start = 0
    end = 100
    sum = 0
    for(num in start..end) {
        if(num % 2 == 0) {
            sum += num
        }
    }
    println("${start}부터 ${end}까지 짝수의 합 : ${sum}")

    sum = 0
    for(num in start..end step 2) {
        sum += num
    }
    println("${start}부터 ${end}까지 짝수의 합 : ${sum}")



}