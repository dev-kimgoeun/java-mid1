package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        //모든 enum 반환
        Grade [] values = Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + " ordinal = " + value.ordinal());
        }

        //string -> enum 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
