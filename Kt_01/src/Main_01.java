public class Main_01 {

    public static void main(String[] args) {
        System.out.println("안녕하세요");

        MyKtClass myKtClass = new MyKtClass();
        String strName = myKtClass.name();

        System.out.printf("이름: %s", strName);
    }

}
