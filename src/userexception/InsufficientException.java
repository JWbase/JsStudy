package userexception;

/**
 * 사용자 정의 예외 클래스 만들기
 * 1. 일반 예외나 런타임 예외를 상속받는다.
 * 2. 기본생성자와 String message를 매개변수로 받는 생성자를 선언
 * -> Exception 객체의 공통 메소드인 getMessage()의 리턴값으로 사용하기 위해 예외 메시지를 부모생성자(super(message))
 * 의 매개 값으로 넘겨준다.
 */

public class InsufficientException extends Exception {
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
