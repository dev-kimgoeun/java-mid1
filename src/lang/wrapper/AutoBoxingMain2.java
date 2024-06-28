package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        //Premitive  - > Wrapper
        int value = 7;
        Integer boxedValue = value; //오토박싱

        //Wrapper -> Primitive
        int unboxecValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxecValue = " + unboxecValue);
    }
}
