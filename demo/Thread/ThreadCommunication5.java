import java.util.concurrent.*;
import java.util.Random;

public class ThreadCommunication5 {
    public static void main(String[] args) {
        int runner = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
        final Random random = new Random();
        for(char runnerName = 'A'; runnerName <= 'C'; runnerName++) {
            final String threadN = String.valueOf(runnerName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long prepareTime = random.nextInt(10000) + 1;
                    System.out.println(threadN + " is preparing for time: " + prepareTime);
                    try {
                        Thread.sleep(prepareTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        System.out.println(threadN + " prepared, waiting for others");
                        cyclicBarrier.await();  // 等待剩余的线程准备好
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println(threadN + " starts running");    // 预期数量的线程已准备好，可以往下执行。
                }
            }).start();
        }
    }
}