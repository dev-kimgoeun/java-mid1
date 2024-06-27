package lang.object.toString;

public class ObjectPrinter {

    public static void print(Object obj) {
        String string = "객체정보출력: " + obj.toString();
        System.out.println(string);
    }
}
