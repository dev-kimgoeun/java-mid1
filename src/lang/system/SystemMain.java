package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재시간 밀리초
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재시간 나노초
        long currentTimeNano = System.currentTimeMillis();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경변수
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성
        System.out.println("properties = " + System.getProperties());
        System.out.println("java version = " + System.getProperty("java.version"));


        //배열을 고속으로 복사
        char[] originalArray = new char[] {'h', 'e','l','l','o'};
        char[] copiesArray = new char[5];
        System.arraycopy(originalArray,0, copiesArray, 0, originalArray.length);

        //배열출력
        System.out.println("copiesArray = " + copiesArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiesArray));

        // 프로그램 종료
        System.exit(0);

    }
}
