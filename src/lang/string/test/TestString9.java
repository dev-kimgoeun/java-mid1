package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {

    String email = "hello@example.com";
    String[] parts = email.split("@");
    String id = parts[0];
    String ps = parts[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + ps);
    }
}
