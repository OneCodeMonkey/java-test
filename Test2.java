import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    private int i = 5;

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.foo();
    }

    public void foo() {
        System.out.println(i);
        foo2(i);
        System.out.println(i);
    }

    public void foo2(int i) {
        i += 1;
    }
}