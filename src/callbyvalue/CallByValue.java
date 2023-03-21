package callbyvalue;

public class CallByValue {
    public static void main(String[] args) {
        MyClass a = new MyClass(10);
        MyClass b = new MyClass(20);

        swap1(a.value, b.value);
        System.out.println(a.value + " " + b.value);

        swap2(a, b);
        System.out.println(a.value + " " + b.value);
    }

    static void swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(MyClass x, MyClass y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
}

class MyClass {
    public Integer value;

    public MyClass(int x) {
        value = x;
    }
}
