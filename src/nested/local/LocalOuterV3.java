package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){

        int localVar = 1; //지역변수는 스택 영역이 종료되는 순간 함께 제거된다

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);

                //인스턴스 변수는 지역변수보다 생명주기가 길다
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        }

        LocalPrinter localPrinter = new LocalPrinter();
        //localPrinter.printData(); 여기서 실행하지 않고 인스턴스만 반환
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(1);
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
