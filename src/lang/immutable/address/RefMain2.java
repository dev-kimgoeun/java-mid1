package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수는 없음

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산");
        b = new ImmutableAddress("부산");
        System.out.println("b -> 부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
