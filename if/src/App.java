import java.util.*;

public class App {
    public static void main(String[] args) {
        //task1();
        task2();

    }

    public static void task1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scn.nextInt();

        if (n > 0) {
            System.out.println("A больше 0");
        } else if (n < 0) {
            System.out.println("A меньше 0");
        } else {
            System.out.println("A равно 0");
        }
        System.out.println("Введите день недели");
        int k = scn.nextInt();

        if (k == 1) {
            System.out.println("Понедельник");
        } else if (k == 2) {
            System.out.println("Вторник");
        } else if (k == 3) {
            System.out.println("Среда");
        } else if (k == 4) {
            System.out.println("Четверг");
        } else if (k == 5) {
            System.out.println("Пятница");
        } else if (k == 6) {
            System.out.println("Суббота");
        } else if (k == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("День недели не найден");
        }
    }

    public static void task2() {
        int sum = 0;
        int[] arr = {10, -5, 16, 99, -46, -1, 50};
        for (int x = 0; x < arr.length; x++) {

            if (arr[x] > 0) {
               int s = arr[x];
                System.out.println(s);
                sum += s;
            }
        }
        System.out.println("Сумма положительных чисел = " + sum);

    }
}