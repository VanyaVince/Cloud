import java.util.Arrays;
import java.util.Random;

public class Application {
    private static Random random = new Random();

    public static void main(String[] args) {
        int count = 0;
        int[] arrayFirst = new int[10];
        int[] arraySecond = new int[13];

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = random.nextInt(1000) + 1;
        }
        System.out.println(Arrays.toString(arrayFirst));

        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = random.nextInt(1000) + 1;
        }
        System.out.println(Arrays.toString(arraySecond));

        for (int first = 0; first < arrayFirst.length; first++){
            for (int second = 0; second < arrayFirst.length; second++){
                if (arrayFirst[first] == arraySecond[second]){
                    count++;
                    }
                }
            }
        if (count >= 3){
            System.out.println("Массив arrayFirst и arraySecond имеют сходство");
        }else {
            System.out.println("Массив arrayFirst и arraySecond сходства не имеют");
        }
    }


}
