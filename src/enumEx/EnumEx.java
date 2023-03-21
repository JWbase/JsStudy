package enumEx;

import java.util.Calendar;

/**
 * https://khfriends.notion.site/JAVA-STUDY-083ffebb787c4a6794302e48a504852d
 */

public class EnumEx {
    public static void main(String[] args) {

        //Week Enum 변수 선언
        Week today = null;

        //java.util.Calendar 객체 사용
        Calendar calendar = Calendar.getInstance(); //싱글톤 방식으로 객체를 new로 생성하는것이 아닌 getInstance메소드르 를 이용해 얻음

        //오늘 날짜 얻기(Calendar객체는 요일을 숫자로 반환해서 알려줌(일요일(1) ~ 토요일(7))
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        //week변수를 상수로 변환
        if (week == 7)
            today = Week.SATURDAY;
        System.out.println("today = " + today);
    }
}
