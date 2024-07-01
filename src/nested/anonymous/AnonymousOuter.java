package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        //익명클래스는 클래스의 본문을 정의하면서 동시에 생성한다.
        Printer printer = new Printer(){ //구현하면서 생성하기
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print(); //바로 호출
        System.out.println("printer.class : "+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(1);
    }
}
