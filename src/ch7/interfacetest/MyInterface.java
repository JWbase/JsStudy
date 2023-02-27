package ch7.interfacetest;

public interface MyInterface {
    void method(); //추상메서드
    default void newMethod() {} // default메소드 -> 접근 제어자는 public
}
