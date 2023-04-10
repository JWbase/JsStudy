package threadexam;

public class ThreadOffExam extends Thread {
    private boolean stop; //stop 필드 선언

    @Override
    public void run() {
        while (!stop) { // stop이 true가 되면 while 문을 빠져나감
            //스레드가 반복 실행되는 코드
        }
        //스레드가 사용한 리소스 정리
    }//스레드 종료
}
