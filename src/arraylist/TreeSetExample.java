package arraylist;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        //정렬된 Integer 객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        //특정 Integer 객체를 가져오기
        System.out.println("scores.first() = " + scores.first());
        System.out.println("scores.last() = " + scores.last());
        System.out.println("scores.lower() = " + scores.lower(95));
        System.out.println("scores.higher() = " + scores.higher(95));
        System.out.println("scores.floor() = " + scores.floor(95));
        System.out.println("scores.ceiling() = " + scores.ceiling(85) + "\n");

        //내림차순으로 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        //범위 검색( 80 <= )
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        //범위 검색( 80 <= score < 90)
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.print(s + " ");
        }
    }
}
