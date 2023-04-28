package lambdaex;

public class LambdaExample3 {
    public static void main(String[] args) {
        Person1 person = new Person1();

        //매개변수가 두 개일 경우
        person.action1(((name, job) -> {
            System.out.print(name +"가 ");
            System.out.println(job + "을 합니당.");
        }));
        person.action1(((name, job) -> System.out.println(name + "가 " + job + "을 하지 않습니당.")));


        //매개변수가 한 개일 경우
        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("이라고 말함");
        });
        person.action2(word -> System.out.println(word + "이라고 외침"));
    }
}
