public class StringDemo {
    public static void main(String[] args) throws Exception {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "hello world";
        String str4 = " hello world ";

        // 返回字符串长度
        System.out.println("r1: " + str1.length());
        // 比较两个字符串的大小 compareTo(返回的是 int), 0相等，1大于，-1小于
        System.out.println("r2: " + str1.compareTo(str2));

        System.out.println("r3: " + str1.compareTo(str3));

        System.out.println("r4: " + str1.compareToIgnoreCase(str3));

        System.out.println("r5: " + str1.indexOf("o"));

        System.out.println("r6: " + str1.lastIndexOf("o"));

        System.out.println("r7: " + str1.substring(0, 5) + str1.substring(6));

        System.out.println("r8: " + str1.replace("o", "h"));
        System.out.println("r9: " + str1.replaceAll("o", "h"));
        System.out.println("r10: " + str1.replaceFirst("o", "h"));
        System.out.println("r11: " + new StringBuffer(str1).reverse());
        System.out.println("r12: " + new StringBuffer(str1).reverse());

        String[] temp = str1.split("\\ ");
        for (String str: temp) {
            System.out.println("r13: " + str);
        }
        System.out.println("r14: " + str1.toUpperCase());
        System.out.println("r15: " + str1.toLowerCase());
        System.out.println("r16: " + str1.trim());
        System.out.println("r17: " + str1.contains("World"));
        System.out.println("r18: " + str1.charAt(4));
        System.out.println("r19: " + str1.endsWith("d"));
        System.out.println("r20: " + str1.startsWith("H"));
        System.out.println("r21: " + str1.startsWith("ll", 2));
        System.out.println("r22: " + str1.concat("haha"));
        System.out.println("r23: " + str1.equals(str2));
        System.out.println("r24: " + str1.equalsIgnoreCase(str2));
        System.out.println("r25: " + str1.isEmpty());
    }
}