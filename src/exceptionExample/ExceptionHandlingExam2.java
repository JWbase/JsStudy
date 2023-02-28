package exceptionExample;

public class ExceptionHandlingExam2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // 데이터가 null일 경우 NullPointerException 발생된다.
            System.out.println("data.length = " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            /*
            System.out.println(e.getMessage()); -> 예외가 발생한 이유만 리턴
            System.out.println(e.toString()); -> 예외의 종류도 같이 리턴
            e.printStackTrace(); -> 예외가 어디서 발생했는지 추적한 내용도 출력
            셋 중 하나의 방법으로 예외 정보를 얻을 수 있다.
            */
        } finally {
            System.out.println("무조건 실행되는 finally 구문");
        }
    }

    public static void main(String[] args) {
        System.out.println("[NullPointerException 확인]");
        printLength("자바 스터디 모임");
        printLength(null);
        System.out.println("[------------------------]");
    }
}
