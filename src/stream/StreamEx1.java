package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 스트림 만드는법
 * 1. 생성하기 : 스트림 인스턴스 생성
 * 2. 가공하기 : 필터링(filtering) 및 매핑(mapping) 등 원하는 결과를 만들어가는 중간 작업(intermediate operations)
 * 3. 결과 만들기 : 최종적으로 결과를 만들어내는 작업
 */
public class StreamEx1 {
    public static void main(String[] args) {
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("FlatBread", true, 400, Food.Type.OTHER));
        foodList.add(new Food("OnionSoup", true, 300, Food.Type.OTHER));
        foodList.add(new Food("LobsterRisotto", true, 520, Food.Type.FISH));
        foodList.add(new Food("BeefWellington", false, 670, Food.Type.MEAT));
//        List<String> highCaloriesFoodName = foodList.stream()
//                .filter(food -> food.getCalories() >= 400) //중간연산
//                .map(Food::getName)// 중간연산
//                .limit(3) // 중간연산
//                .collect(Collectors.toList()); // 최종연산
//
//        System.out.println("highCaloriesFoodName = " + highCaloriesFoodName);

        // 컬렉션을 이용한 반복(외부반복 : 사용자가 반복문을 직접 명시)
//        List<String> foodNameList = new ArrayList<>();
//        for (Food food : foodList) {
//            foodNameList.add(food.getName());
//        }

        /*
         스트림을 이용한 반복
          -> 별도의 반복자 없이도 반복문을 처리 할 수 있고, 작업을 병렬로 처리할 수 있다.
          */

        List<String> foodNameList = foodList.stream()
                .map(Food::getName)
                .collect(Collectors.toList());
        System.out.println("foodNameList = " + foodNameList);

        /**
         * 스트림의 연산 스트림에는 API에서 제공하는 여러가지 연산이 정의 되어 있다. 중간연산, 최종연산으로 구분
         * 중간연산 : 파이프라인으로 연결할 수 있는 연산들 -> 최종연산을 수행하기전에는 실행되지 않음
         * 최종연산 : 파이프라인을 실행한다음 닫는 연산
         */

        List<String> highCaloriesFoodName = foodList.stream()
                .filter(food -> {
                    System.out.println("filter = " + food.getName());
                    return food.getCalories() > 400;
                })
                .map(food -> {
                    System.out.println("map = " + food.getName());
                    return food.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("highCaloriesFoodName = " + highCaloriesFoodName);

        // -> 하나씩 쭉 ~ 연산하고 다음꺼 이런식으로 연산
        // 최종연산은 파이프라인 연산의 결과를 출력 다양한 형태로 출력할 수 있다.

    }


}
