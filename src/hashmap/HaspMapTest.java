package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HaspMapTest {
    public static void main(String[] args) {
        HashMap<String, String> mapTest = new HashMap<>();
        mapTest.put("key1", "value1");
        mapTest.put("key2", "value2");
        mapTest.put("key3", "value3");
        mapTest.put("key4", "value4");

        mapTest.forEach((key, value) -> System.out.println("key + value = " + key + value));
        mapTest.entrySet().stream().forEach(entry -> {
            System.out.println("entry.getKey() + entry.getValue() = " + entry.getKey() + entry.getValue());
        });

    }
}
