package arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("이정우", 100);
        map.put("아무개", 70);
        map.put("모르쇠", 65);
        map.put("홍길동", 80);

        System.out.println("map = " + map.size());

        //키로 값 얻기
        String key = "이정우";
        int value = map.get(key);
        System.out.println("key = " + value);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("이정우");
        System.out.println("mapSize = " + map.size());
        System.out.println();
    }
}
