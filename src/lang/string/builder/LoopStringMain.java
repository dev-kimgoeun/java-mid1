package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();

        String result = "";
        for(int i=0; i<100000; i++){
            result += "hello java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - StartTime) + "ms" );
    }
}
