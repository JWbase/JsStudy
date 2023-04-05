package threadexam;

public class WorkThread extends Thread {
    //필드
    public boolean work = true;

    public WorkThread(String name) {
        setName(name);
    }

    //메소드

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + " : 작업처리");
            } else {
                Thread.yield();
            }
        }
    }
}
