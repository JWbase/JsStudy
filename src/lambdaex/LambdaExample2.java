package lambdaex;

public class LambdaExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근");
            System.out.println("퇴근");
        });

        //실행문이 한 개 일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("스터디 시러!!!"));
    }
}
