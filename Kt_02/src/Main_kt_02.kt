fun main() {

    var memberVO = MemberVO("무명","010","주소", 30)
    println("이름 : ${memberVO.name}")
    println("전화 : ${memberVO.tel}")
    println("주소 : ${memberVO.addr}")
    println("나이 : ${memberVO.age}")

    var addrVO = AddrVO(1)
    addrVO.name = "누군가"
    addrVO.postNo = "10235"
    addrVO.addr = "지구"

}