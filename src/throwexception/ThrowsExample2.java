package throwexception;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception {
        findClass();
    }

    private static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
