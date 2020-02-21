public class Main_03 {

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public String name() {
                return null;
            }
        };

        String str_name1 = myInterface.name();
        String str_name2 = sub(new MyInterface() {
            @Override
            public String name() {
                return "무명";
            }
        });

        // Java 1.8 이상에서 인터페이스를 익명클래스로 생성하는 lambda 방식
        // () : 메소드식별자
        // -> : 메소드 본체를 가리키는 화살표 함수
        // {} : 구현코드
        String str_name3 = sub( () -> {return "이름3";} );
    }

    public static String sub(MyInterface myInterface) {
        return myInterface.name();
    }

}
