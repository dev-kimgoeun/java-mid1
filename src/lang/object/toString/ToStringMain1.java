package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접출력
        System.out.println(o);
    }
}
