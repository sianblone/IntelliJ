fun main(args: Array<String>) {


    var num1 : Int = 0
    var num2 : Long = 3
    var sum : Long = 0

    num1 = 30
    num2 = 50

    sum = (num1 + num2).toLong()
    println(sum)
    println("합계 : ${sum}")

    var name : String = ""
    // 코틀린에서는 null로 선언이 불가능
    // 따라서 null로 선언하고 싶다면 ? 를 붙어주어야 한다
    var nation : String? = null

}