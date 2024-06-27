package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {

        String a = "hello";
        String b = " java";
        String result1 = a.concat(b);
        String result2 = a+b; //참조형이지만 예외적 허용

        System.out.println(result1);
        System.out.println(result2);
    }
}
