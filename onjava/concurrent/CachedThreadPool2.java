package onjava.concurrent;

import java.util.concurrent.*;
import java.util.stream.*;

public class CachedThreadPool2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        IntStream.range(0, 10).mapToObj(InterferingTask::new).forEach(exec::execute);

        exec.shutdown();
    }
}