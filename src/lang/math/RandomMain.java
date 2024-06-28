package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
       Random random = new Random();
      //random random = new Random(2); //seed가 같으면 random의 결과가 같다

       int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randmRange = random.nextInt(10);
        System.out.println("0~9 :" + randmRange);

        int randomRange1 = random.nextInt(10)+1;
    }
}
