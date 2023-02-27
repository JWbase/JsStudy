package arraylist;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();

        //작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료 될 때 까지 메인스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }

        // 저장된 총 엔트리 수 얻기
        int size = map.size();
        System.out.println("size = " + size);
    }
}
