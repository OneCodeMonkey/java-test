public class ThreadCommunication {
    public static void main(String[] args) {
        System.out.println("-- demo1 -- A,B线程同时运行");
        demo1();
    }

    public static void demo1() {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("B");
            }
        });

        a.start();
        b.start();
    }

    private static void printNumber(String threadName) {
        int i = 0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }
    }
}