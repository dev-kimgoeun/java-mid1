package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested = " + nested.getClass());
    }
}
