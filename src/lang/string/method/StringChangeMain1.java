package lang.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {
        String str = "hello java welcome to java";

        System.out.println("인덱스 7부터의 부분 문자열 : " + str.substring(7));
        System.out.println("인덱스 7부터 12까지의 부분 문자열 : " + str.substring(7, 12));

        System.out.println("문자열 결합 : "+ str.concat("!!!"));

        System.out.println("java를 world로 대체 : " + str.replace("java", "world"));
        System.out.println("첫 번째 java를 world로 대체 :" + str.replaceFirst("java", "world"));
    }
}
