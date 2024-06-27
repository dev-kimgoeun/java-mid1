package lang.string.builder;

public class LoopStringBulderMain {

    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<100000; i++){
        sb.append("hello java");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + sb);
        System.out.println("time = " + (endTime - StartTime) + "ms" );
    }
}
