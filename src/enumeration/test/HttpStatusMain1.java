package enumeration.test;

import java.util.Scanner;

public class HttpStatusMain1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("코드 번호를 입력하세요 : ");
        int code = sc.nextInt();

        HttpStatus status  = HttpStatus.findByCode(code);
        if(status == null){
            System.out.println("정의되지 않은 코드");
        }else {
            System.out.println(status.getCode() + " "+status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
