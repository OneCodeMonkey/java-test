import java.lang.Thread;

public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getStackTrace()[0]);
            System.out.println(number++);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ReaderThread().start();
        }
        ready = true;
    }
}