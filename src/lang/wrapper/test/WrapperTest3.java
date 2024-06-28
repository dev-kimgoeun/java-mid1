package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str ="100";
        Integer integer1 = Integer.valueOf(str);
        int intvalue = integer1.intValue();
        Integer integer2 = Integer.valueOf(intvalue);

        System.out.println("integer1 = " + integer1);
        System.out.println("intvalue = " + intvalue);
        System.out.println("integer2 = " + integer2);
    }
}
