package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {

    String fruits = "apple,banana,mange";
    String [] fruit = fruits.split(",");
        for (String s : fruit) {
            System.out.println(s);
        }
        String str = String.join("->",fruit );
        System.out.println("joindString = " + str);
    }
}
