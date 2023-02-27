package stream;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleEx {
    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("grape");
        fruitList.add("melon");
        fruitList.add("orange");

        System.out.println("fruitList = " + fruitList);

        Collections.shuffle(fruitList);
        System.out.println("shuffleFruitList = " + fruitList);
    }
}
