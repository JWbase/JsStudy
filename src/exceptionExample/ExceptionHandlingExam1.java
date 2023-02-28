package exceptionExample;

public class ExceptionHandlingExam1 {
    public static void printLength(String data) {
        int result = data.length(); // 데이터가 null일 경우 NullPointerException 발생된다.
        System.out.println("data.length = " + result);
    }

    public static void main(String[] args) {
        System.out.println("[NullPointerException 확인]");
        printLength("자바 스터디 모임");
        printLength(null);
        System.out.println("[------------------------]");
    }
}
