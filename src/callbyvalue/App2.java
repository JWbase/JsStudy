package callbyvalue;

public class App2 {
    public static void main(String[] args) {
        MyClass2 i = new MyClass2(10);
        System.out.println("before i : " + System.identityHashCode(i));

        ChangeInteger(i);
        System.out.println("after i : " + System.identityHashCode(i));


        System.out.println(i.value);
    }

    static void ChangeInteger(MyClass2 a) {
        System.out.println("before i : " + System.identityHashCode(a));
        a.value = 20;
        System.out.println("after i : " + System.identityHashCode(a));

    }
}

class MyClass2 {
    public Integer value;

    public MyClass2(int x) {
        value = x;
    }
}
