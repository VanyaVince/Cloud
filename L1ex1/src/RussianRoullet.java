import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RussianRoullet {
    private static int number = 6;
    private static int point = 0;
    private static int[] level_2 = new int[2];
    private static int[] level_3 = new int[3];
    private static boolean isGameStillActive = true;

    public static void main(String[] args) {

        roullet();
    }

    private static void roullet() {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);

        System.out.println("Выберите количество пуль: (максимальное количество 3)");
        int choiseByLevel = scn.nextInt();

        switch (choiseByLevel) {
            case (1):

                while (true) {
                    System.out.println("Введите число от 0 до 6");
                    int n1 = scn.nextInt(number + 1);
                    int n2 = random.nextInt(number + 1);
                    System.out.println("Выпавшее число: " + n2);
                    if (n1 != n2) {
                        point++;
                        System.out.println("Вы победили, количество ваших очков: " + point);
                        System.out.println();
                    } else {
                        System.out.println("Игра закончена, ваше количество очков : " + point);
                        break;
                    }
                }
                break;
            case (2):
                while (isGameStillActive) {
                    System.out.println("Введите число от 0 до 6");
                    int n1 = scn.nextInt(number + 1);
                    for (int i = 0; i < level_2.length; i++) {
                        level_2[i] = ((int) (Math.random() * 7));

                        if (n1 != level_2[i]) {
                            point++;
                            if (i == 1) {
                                System.out.println("Вапавшее числа " + Arrays.toString(level_2));
                                System.out.println("Вы победили, количество ваших очков: " + point);
                                System.out.println();
                            }
                        } else {
                            System.out.println("Вапавшее числа " + Arrays.toString(level_2));
                            System.out.println("Игра закончена, ваше количество очков : " + point);
                            isGameStillActive = false;
                            break;
                        }
                    }
                }
                break;
            case (3):
                while (isGameStillActive) {
                    System.out.println("Введите число от 0 до 6");
                    int n1 = scn.nextInt(number + 1);
                    for (int i = 0; i < level_3.length; i++) {
                        level_3[i] = ((int) (Math.random() * 7));

                        if (n1 != level_3[i]) {
                            point++;
                            if (i == 2) {
                                System.out.println("Вапавшее числа " + Arrays.toString(level_3));
                                System.out.println("Вы победили, количество ваших очков: " + point);
                                System.out.println();
                            }
                        } else {
                            System.out.println("Вапавшее числа " + Arrays.toString(level_3));
                            System.out.println("Игра закончена, ваше количество очков : " + point);
                            isGameStillActive = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
