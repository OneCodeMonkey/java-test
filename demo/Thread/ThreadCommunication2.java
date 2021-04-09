public class ThreadCommunication2 {
    public static void main(String[] args) {
        System.out.println("-- demo2 -- A执行完再执行B");
        demo2();
    }

    public static void demo2() {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程 B 开始等待线程 A");
                try {
                    a.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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