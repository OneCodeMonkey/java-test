import java.util.*;
import java.util.stream.*;
import generics.coffee.*;

public class ArrayListDisplay {
    public static void main(String[] args) {
        List<Coffee> coffees = Stream.generate(new CoffeeSupplier())
                .limit(10)
                .collect(Collectors.tolist());

        System.out.println(coffees);
    }
}