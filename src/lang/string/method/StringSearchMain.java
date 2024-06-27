package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "hello java! Welcome to java world";

        System.out.println("문자열에 java가 포함되어 있는지 : " + str.contains("java"));
        System.out.println("java의 첫번째 인덱스 : " + str.indexOf("java"));
        System.out.println("인덱스의 10부터 java의 인덱스 : "+ str.indexOf("java", 10));
        System.out.println("java의 마지막 인덱스 : " +str.lastIndexOf("java"));
    }
}
