import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    private static void task1() {
        int[] numbers = new int[]{5, 1, 20, 3, 15, 67};
        for (int iterator = 0; iterator < numbers.length; iterator++) {
            for (int index = iterator; index < numbers.length; index++) {
                if (numbers[index] < numbers[iterator]) {
                    int tmb = numbers[iterator];
                    numbers[iterator] = numbers[index];
                    numbers[index] = tmb;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void task2() {
        String str = "абракадаба";
        //str.toCharArray();
        while (!(str.length() == 0)) {
            char charFirstElement = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (charFirstElement == str.charAt(i)) {
                    count = count + 1;
                }
            }
            System.out.println(charFirstElement + " " + count);
            str = str.replaceAll("" + charFirstElement, "");
        }
    }

    private static void task3() {
        int[][] smail;
        smail = new int[8][10];
        smail[0][0] = 0;
        smail[0][1] = 0;
        smail[0][2] = 55;
        smail[0][3] = 0;
        smail[0][4] = 0;
        smail[0][5] = 0;
        smail[0][6] = 0;
        smail[0][7] = 55;
        smail[0][8] = 0;
        smail[0][9] = 0;
        smail[1][0] = 0;
        smail[1][1] = 0;
        smail[1][2] = 55;
        smail[1][3] = 0;
        smail[1][4] = 0;
        smail[1][5] = 0;
        smail[1][6] = 0;
        smail[1][7] = 55;
        smail[1][8] = 0;
        smail[1][9] = 0;
        smail[2][0] = 0;
        smail[2][1] = 0;
        smail[2][2] = 55;
        smail[2][3] = 0;
        smail[2][4] = 0;
        smail[2][5] = 0;
        smail[2][6] = 0;
        smail[2][7] = 55;
        smail[2][8] = 0;
        smail[2][9] = 0;
        smail[3][0] = 0;
        smail[3][1] = 0;
        smail[3][2] = 55;
        smail[3][3] = 0;
        smail[3][4] = 0;
        smail[3][5] = 0;
        smail[3][6] = 0;
        smail[3][7] = 55;
        smail[3][8] = 0;
        smail[3][9] = 0;
        smail[4][0] = 55;
        smail[4][1] = 0;
        smail[4][2] = 0;
        smail[4][3] = 0;
        smail[4][4] = 0;
        smail[4][5] = 0;
        smail[4][6] = 0;
        smail[4][7] = 0;
        smail[4][8] = 0;
        smail[4][9] = 55;
        smail[5][0] = 0;
        smail[5][1] = 55;
        smail[5][2] = 0;
        smail[5][3] = 0;
        smail[5][4] = 0;
        smail[5][5] = 0;
        smail[5][6] = 0;
        smail[5][7] = 0;
        smail[5][8] = 55;
        smail[5][9] = 0;
        smail[6][0] = 0;
        smail[6][1] = 0;
        smail[6][2] = 55;
        smail[6][3] = 0;
        smail[6][4] = 0;
        smail[6][5] = 0;
        smail[6][6] = 0;
        smail[6][7] = 55;
        smail[6][8] = 0;
        smail[6][9] = 0;
        smail[7][0] = 0;
        smail[7][1] = 0;
        smail[7][2] = 0;
        smail[7][3] = 55;
        smail[7][4] = 55;
        smail[7][5] = 55;
        smail[7][6] = 55;
        smail[7][7] = 0;
        smail[7][8] = 0;
        smail[7][9] = 0;
        for (int x = 0; x < 8; x++) {
            for (int a = 0; a < 10; a++) {
                System.out.print(smail[x][a] + "\t");
            }
            System.out.println();
        }
    }
}