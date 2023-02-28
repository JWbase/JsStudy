package exceptionExample;

public class ClassNotFoundExample {

    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); //ClassNotFoundException 확인하기
            System.out.println("------- 클래스가 이미 있음 -------");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
        try {
            Class.forName("java.lang.Stirng2");
            System.out.println("------- 이미 있음 -------");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
