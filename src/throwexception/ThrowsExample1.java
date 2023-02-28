package throwexception;
/**
 * 메소드를 호출한 곳으로 예외를 떤질수 있다!
 * 리턴타입 메소드명(매개변수) throws 예외클래스1, 예외클래스2, ... {}
 * 예외가 많을 경우 throws Exception 이나 throws Throwable 로 예외를 던질 수 있다.
 * main() 메소드에 throws 키워드를 사용해서 예외를 던지면 JVM이 콘솔에 출력하는 것으로 예외 처리를 한다.
 */
public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }
    }

    private static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
