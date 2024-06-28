package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str ="100";
        Integer integer1 = Integer.valueOf(str);
        int intvalue = integer1;
        Integer integer2 = intvalue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intvalue = " + intvalue);
        System.out.println("integer2 = " + integer2);
    }
}
