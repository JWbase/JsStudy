package resourcetrywith;

/**
 * 리소스 : 데이터를 제공하는 객체
 * 리소스를 사용하려면 open하고 사용이 끝나면 close해야함
 * 리소스 사용시 예외 발생하면 안전하게 닫는 것이 중요
 * try - with - resource 블록 사용하면 예외 발생 여부와 상관없이 리소스를 자동으로 닫음.
 */
public class TryWithResourceExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }

        System.out.println();

        try (MyResource res = new MyResource("A")) {
            String data = res.read2();
            //NumberFormatException 발생
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }
    }
}
