package annotationEx;

public class Service {

    @PrintAnnotation
    public void method1() {
        System.out.println("실행 1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행 2");
    }

    @PrintAnnotation(value = "#", number = 10)
    public void method3() {
        System.out.println("실행 3");
    }
}
