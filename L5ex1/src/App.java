import java.util.*;

public class App {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
    }

    public static void example1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Max number");
        int n = scn.nextInt();
        System.out.println("Our degree");
        int k = scn.nextInt();

        int sum = 0;

        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            Arr[i] = i + 1;
            sum += Math.pow(Arr[i], k);
        }

        System.out.println(Arrays.toString(Arr));
        System.out.println(sum);
    }


    public static void example2() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter week day number");
        int n = scn.nextInt();

        switch (n) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("День не найден");

        }
    }

    public static void example3() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Max number");
        int n = scn.nextInt();
        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Number");
            Arr[i] = scn.nextInt();

        }
        System.out.println(Arrays.toString(Arr));
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
        }
        System.out.println(max);
    }

    public static void example4() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Max number");
        int n = scn.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n > 0);
    }

    public static void example5() {
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Max number");
        int n = scn.nextInt();
        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Number");
            Arr[i] = scn.nextInt();
            sum += Arr[i];
        }
        System.out.println(sum / n);
    }

    public static void example6() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Max number");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.print("\n");
        }
    }
}



