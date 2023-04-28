package lambdaex;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person2 person = new Person2();

        //정적 메소드
        //person.action((x,y) -> Computer.staticMethod(x,y));
        person.action(Computer::staticMethod);

        //인스턴스 메소드
        Computer com = new Computer();
        //person.action((x,y) -> com.instanceMethod(x,y));
        person.action(com::instanceMethod);

        Person3 person3 = new Person3();
        person3.ordering(String::compareToIgnoreCase);
    }
}
