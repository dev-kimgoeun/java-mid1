package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 member1 = new MemberV2("회원a", address);
        MemberV2 member2 = new MemberV2("회원b", address);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        //회원2의 주소를 부산으로 변경
//        member2.getAddress().setValue("부산"); 컴파일오류
        member2.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 - > member2.getAddress");
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
