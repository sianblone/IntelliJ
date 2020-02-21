fun main(args: Array<String>) {
    var myClass = MyClass()

    var strNation = myClass.nation()
    println("우리나라 명칭: ${strNation}")

    var myNameClass = MyKtClass()
    var strName = myNameClass.name()

    println("이름: ${strName} 출생국가:${strNation}")
}