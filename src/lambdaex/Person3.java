package lambdaex;

public class Person3 {
    public void ordering(Comparable comparable) {
        String a = "일정우";
        String b = "이정우";

        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.println(a + "는" + b + "보다 앞에 옴");
        } else if (result == 0) {
            System.out.println(a + "=" + b);
        } else {
            System.out.println(a + "는" + b + "보다 뒤에 옴");
        }
    }
}
