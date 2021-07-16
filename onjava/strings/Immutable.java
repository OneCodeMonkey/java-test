public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);      //
        String qq = upcase(q);      // 字符串做参数时，传递的是一个引用的副本，作为方法的参数时，不会改变本身的值。
        System.out.println(qq);
        System.out.println(q);
    }
}