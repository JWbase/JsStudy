package ch7;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매시 제공하는 보너스 점수

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class Tv2 extends Product {
    public Tv2() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv2());
        b.buy(new Computer());

        System.out.println("잔액은 = " + b.money);
        System.out.println("보너스는 = " + b.bonusPoint);
    }

}


