fun main(args: Array<String>) {

    var sum = 0
    // range 값을 사용하여 for 반복문 만들기
    for(num in 1..10) {
        sum += num
    }
    println("합계" + sum)
    println("합계는 ${sum} 입니다")

    println("======================================")

    for(i in 1 until 10) {
        println(i)
    }

    println("======================================")
    
    var arrList = ArrayList<String>()
    arrList.add("대한민국")
    arrList.add("Korea")
    arrList.add("Republic of Korea")
    for(str in arrList) {
        println(str)
    }

}