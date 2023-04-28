package lambdaex;

public class Person2 {
    public void action(Calculable2 calculable) {
        double result = calculable.calc(10, 4);
        System.out.println("결과 : " + result);
    }
}
