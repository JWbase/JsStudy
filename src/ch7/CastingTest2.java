package ch7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new FireEngine();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; // 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용 X
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
