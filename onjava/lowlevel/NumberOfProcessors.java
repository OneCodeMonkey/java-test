/**
 * 打印CPU线程数
 */
public class NumberOfProcessors {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}