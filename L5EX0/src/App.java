import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    public static void Task1() {
        System.out.println("Введите число");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int a = input / 10;
        int b = input % 10;
        System.out.println("Первое число" + a);
        System.out.println("Первое число" + b);
        if (a == b) {
            System.out.println("оба числа равны");
        }
        if (a > b) {
            System.out.println("Первое число больше второго");
        }
        if (a < b) {
            System.out.println("Первое число меньше второго");
        }
    }

    public static void Task2() {
        System.out.println("Enter number");
        Scanner scn = new Scanner(System.in);
        long input = scn.nextInt();
        Long one, two, three, four;
        four = input % 10;
        three = (input / 10) % 10;
        two = (input / 100) % 10;
        one = input / 1000;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

    }


    public static void Task3() {
        int gramm = 1000;
        System.out.println("Введите количество грамм");
        Scanner scn = new Scanner(System.in);
        float input = scn.nextInt();
        float kgSumm = input / gramm;
        System.out.println("Количество килограмм " + kgSumm);

    }

    public static void Task4() {
        System.out.println("Введите первое число");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("Введите второе число");
        int b = scn.nextInt();
        if (a > b) {
            System.out.println("The first number more the second");
            if (a < b) {
                System.out.println("The first number less the second");
                if (a == b) {
                    System.out.println("Both number are equal");
                }
            }
        }
    }

    public static void Task5() {
        Scanner scn = new Scanner(System.in);
        System.out.println("The first number");
        int a = scn.nextInt();
        System.out.println("The second number");
        int b = scn.nextInt();
        System.out.println("The third number");
        int c = scn.nextInt();
        int Summ = (a + b - c / a) + c * a * a - (a + b);
        System.out.println("Our number" + Summ);


    }
}
