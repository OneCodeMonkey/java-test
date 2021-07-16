import java.util.*;

class CalculateNaturalLogarithms {
    public static void main(String[] args) {
        int base = 2;
        while (true) {
            double timeStart = System.currentTimeMillis();
            double e = getNaturalLogarithms(base);
            double timeEnd = System.currentTimeMillis();
            System.out.println("base: " + base + "\te: " + e + "\tcost-time: " + (timeEnd - timeStart));
            base = base + 10000;
        }
    }

    private static double getNaturalLogarithms(int base) {
        return Math.pow((1 + 1 / (double)base), (double)base);
    }
}