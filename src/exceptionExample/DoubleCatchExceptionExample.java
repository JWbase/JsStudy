package exceptionExample;

public class DoubleCatchExceptionExample {
    public static void main(String[] args) {
        String[] array = {"100", "200", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과 \n예외 메시지 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요. \n예외 메시지 : " + e.getMessage());
            }
        }
    }
}
