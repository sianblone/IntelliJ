fun main(args: Array<String>) {
    println("코틀린 파일")

    // 추론형 type 결정 방식 변수 선언
    // 변수를 선언할 때 반드시 값이 존재해야 한다 : var strName 만 선언 불가능
    var intNum = 3
    var strName = "홍길동"

    var intSum = 0
    var strName1 = ""

    // 원칙적으로는 null값인 변수를 선언할 수 없다
    var strName2 = null

    // 콜론 뒤에 첫 글자를 명시하여 변수 type을 결정할 수 있다
    var int1 : Int = 0
    var str1 : String = ""

    println("숫자 : " + intNum)
    println("이름 : " + strName)
}