package threadexam;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread2 printThread = new PrintThread2();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

    }
}
