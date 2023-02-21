package ch7;

/**
 * 조상타입의 참조 변수로 자손타입의 인스턴스를 참조 할 수 있다.(Tv t = new CaptionTv();)
 * 반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조 할 수 없다. CaptionTv t = new Tv(); -> X
 */
public class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class CaptionTv extends Tv {
    String text;

    void caption() {
    }
}
