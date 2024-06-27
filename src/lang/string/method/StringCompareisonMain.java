package lang.string.method;

public class StringCompareisonMain {

    public static void main(String[] args) {

        String str1 = "hello java";
        String str2 = "Hello Java";
        String str3 = "Hello World";

        System.out.println("str1 equals str2 :" + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 :" + str1.equalsIgnoreCase(str2));

        System.out.println("b compare to a : " + "b".compareTo("a"));

        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with hello ; " + str1.startsWith("hello"));
        System.out.println("str1 ends with hello ; " + str1.endsWith("java"));
    }
}
