package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 member1 = new MemberV1("회원a", address);
        MemberV1 member2 = new MemberV1("회원b", address);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        //회원2의 주소를 부산으로 변경
        member2.getAddress().setValue("부산");
        System.out.println("부산 - > member2.getAddress");
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
