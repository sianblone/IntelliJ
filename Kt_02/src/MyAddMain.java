public class MyAddMain {

    public static void main(String[] args) {
        // 선언은 interface로, 생성은 implement한 클래스로
        // interface에 구현된 메소드에 implement한 클래스 덮어쓰기(인터페이스에 구현되지 않은 메소드는 버리기)
        MyAddItf myAdd = new MyAddImpl();
        int sum = myAdd.add(3,4);

        // 익명(무명, 식별자 없는) 클래스를 생성과 동시에 사용하는 방법
        //  1. 인터페이스 객체 선언
        //  2. 인터페이스로 생성 및 초기화
        //  3. 인터페이스에 정의된 method를 구현하여 메소드 호출하기
        MyAddItf myAdd2 = new MyAddItf() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };
        sum = myAdd2.add(4,5);

        // Java 1.8 이상의 람다방식으로 인터페이스 구현하기
        //  1. 람다 방식으로 인터페이스 생성 및 초기화
        //  2. 객체를 사용하여 메소드 호출하기
        // () 안에 매개변수 이름 -> {} 안에 실행코드
        MyAddItf myAdd3 = (x,y) -> { return x + y; };
        sum = myAdd3.add(10,20);

        /*
        FunctionalInterface를 사용하는 코드
        한 번만 사용하고 더 이상 사용할 필요 없는 메소드가 있는데
        이 메소드를 사용하기 위해 1. 클래스를 만들고, 2. 인터페이스를 implements 하고 3. 메소드의 코드를 작성한 후
        4. 만든 클래스로 객체를 생성하고, 객체로부터 메소드를 호출하는 전통적인 방식은
        코드의 불필요한 낭비가 발생할 수 있기 때문에 익명클래스를 사용해서 클래스를 선언한 것과 같은 효과를 낸다
        또한 익명클래스를 만드는데 코드를 더욱 줄이기 위해 자바 1.8에서는 람다 코드 방식을 도입하였다

        JavaScript에서 어떤 함수의 매개변수로 callback 함수를 전달할 때
        외부에 함수를 선언한 후 이름을 전달하는 방법을 사용하지 않고
        직접 매개변수에 function 키워드 만으로 함수를 직접 코딩하는 방법에서 패턴을 가져온 것이다다
         */
   }

}
