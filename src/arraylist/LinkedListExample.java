package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        LinkedList<String> list2 = new LinkedList<>();

        //시작 시간 끝 시간
        long startTime;
        long endTime;

        //ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", endTime - startTime); // %-17s -> 문자열이 해당위치에 삽입 및 17너비에서 왼쪽 정렬

        //LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", endTime - startTime);
    }
}
