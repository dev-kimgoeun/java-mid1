package lang.wrapper;

public class AutoBoxingMain1 {

    public static void main(String[] args) {
        //Premitive  - > Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitive
        int unboxecValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxecValue = " + unboxecValue);
    }
}
