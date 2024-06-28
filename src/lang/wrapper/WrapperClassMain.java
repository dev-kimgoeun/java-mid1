package lang.wrapper;

import java.awt.*;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정 대신에 valueOf()를 사용
        Integer integer1 = Integer.valueOf(10);
        Long longObj  = Long.valueOf(233333);
        Double doubleObj = Double.valueOf(0.2323);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integer1 = " + integer1);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 비교");
        int intValue  = newInteger.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println(" == :" + (newInteger == integer1));
        System.out.println("equals : " + (newInteger.equals(integer1)));
    }
}
