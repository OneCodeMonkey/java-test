package onjava.generics;

public class GenericHolder<T> {
    private T a;
    public GenericHolder() {}
    public void set(T a) {
        this.a = a;
    }
    public T get() {
        return a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> h3 = new GenericHolder<Automobile>();
        h3.set(new Automobile());
        Automobile a = h3.get();
        // -h3.set("Not a automobile");     // 类型不对
        // -h3.set(1);          // 类型不对
    }
}