package ch7;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child(); //멤버변수명이 같은 경우 조상타입의 참조변수를 참조하면 조상, 자손을 참조하면 자손 출력
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class BindingTest2 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    @Override
    void method() {
        System.out.println("x = " + x); // this.x와 같다.
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
