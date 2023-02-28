package exceptionExample;

/**
 * 두개 이상의 예외를 하나의 catch 블록에서 동일하게 처리하고 싶을때는 | 기호로 연결
 */
public class SameHandleingExceptionExam {
    public static void main(String[] args) {
        String[] array = {"150", "200", null, "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과 \n예외 메시지 : " + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("문제 발생");
            }
        }
    }
}
