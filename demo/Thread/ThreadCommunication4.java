import java.util.concurrent.*;

public class ThreadCommunication4 {
    public static void main(String[] args) {
        int worker = 3;
        CountDownLatch countDownLatch = new CountDownLatch(worker);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("D is waiting");
                try {
                    countDownLatch.await();
                    System.out.println("All done, D starts working");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        for(char threadName = 'A'; threadName <= 'C'; threadName++) {
            final String threadN = String.valueOf(threadName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(threadN + " is working");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(threadN + " finished");
                    countDownLatch.countDown();
                }
            }).start();
        }
    }
}