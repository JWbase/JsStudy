package exceptionExample;

/**
 * 예외처리 클래스가 상속관계에 있을 때 하위 클래스 Catch 블록을 먼저 작성하고 상위를 해야한다.
 * 예외가 발생하면 catch 블록은 위에서 부터 차례대로 검사가 되기 때문
 */

public class InheritExceptionExam {
    public static void main(String[] args) {
        String[] array = {"150", "200", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과 \n예외 메시지 : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("실행 문제 발생");
            }
        }
    }
}
