public class DeadLockExample {
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();

        Thread thd1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    System.out.println("线程1获取到了锁A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //
                    }

                    System.out.println("线程1尝试获取锁B。。。");
                    synchronized (lockB) {
                        System.out.println("线程1获取到了锁B");
                    }
                }
            }
        });
        Thread thd2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println("线程2获取到了锁B");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //
                    }

                    System.out.println("线程2尝试获取锁A。。。");
                    synchronized (lockA) {
                        System.out.println("线程2获取到了锁A");
                    }
                }
            }
        });
        thd1.start();
        thd2.start();
    }
}
