import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        App task = new App();
        //task.task1();
        task.task2();

    }

    public void task1() {
        int summ = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количесвто чисел");
        int n = scn.nextInt();
        int[] Numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Число массива");
            Numbers[i] = scn.nextInt();
            if (Numbers[i] < 0) {
                summ += Numbers[i];
            }
        }
        System.out.println(Arrays.toString(Numbers));
        System.out.println(summ);

    }

    public void task2() {
        float max = 0;
        int summ1 = 0;
        int summ2 = 0;
        int summ3 = 0;
        int summ4 = 0;
        float avg1 = 0f;
        float avg2 = 0f;
        float avg3 = 0f;
        float avg4 = 0f;
        int[] Numbers = new int[1000];


        for (int i = 0; i < 250; i++) {
            Numbers[i] = ((int) (Math.random() * 500) - 180);
            summ1 += Numbers[i];
            avg1 = summ1 / 4;
            if (max < avg1) {
                max = avg1;
            }
        }
        //System.out.println(Arrays.toString(Numbers));
        System.out.println("Среднее арифметическое 1-х четырех элементов массива = " + avg1);


        for (int i = 250; i < 500; i++) {
            Numbers[i] = ((int) (Math.random() * 500) - 180);
            summ2 += Numbers[i];
            avg2 = summ2 / 4;
            if (max < avg2) {
                max = avg2;
            }
        }
        //System.out.println(Arrays.toString(Numbers));
        System.out.println("Среднее арифметическое 2-х четырех элементов массива = " + avg2);


        for (int i = 500; i < 750; i++) {
            Numbers[i] = ((int) (Math.random() * 500) - 180);
            summ3 += Numbers[i];
            avg3 = summ3 / 4;
            if (max < avg3) {
                max = avg3;
            }
        }
        //System.out.println(Arrays.toString(Numbers));
        System.out.println("Среднее арифметическое 3-х четырех элементов массива = " + avg3);


        for (int i = 750; i < 1000; i++) {
            Numbers[i] = ((int) (Math.random() * 500) -180);
            summ4 += Numbers[i];
            avg4 = summ4 / 4;
            if (max < avg4) {
                max = avg4;
            }
        }
        //System.out.println(Arrays.toString(Numbers));
        System.out.println("Среднее арифметическое 4-х четырех элементов массива = " + avg4);
        System.out.println();
        System.out.println("Высшее средне арифметическое значение 4-х массивов = " + max);


    }
}


