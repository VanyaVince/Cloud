public class App {

    public static void main(String[] args) {
        arithmetic(14, 15);
        binary(1, 2);
        logical(true, false);
        condition(true);
        condition(false);
        ternary(true, 1, 2);
        ternary(false, 1, 2);
    }

    public static void arithmetic(int first, int second) {
        int a1 = first + second;
        System.out.println(a1);
        int a2 = first - second;
        System.out.println(a2);
        int a3 = first * second;
        System.out.println(a3);
        int a4 = first / second;
        System.out.println(a4);
        int a5 = first % second;
        System.out.println(a5);
        int a6 = ++a1;
        System.out.println(a6);
        int a7 = a2++;
        System.out.println(a7);
        int a8 = --a1;
        System.out.println(a8);
        int a9 = a2--;
        System.out.println(a9);
    }

    public static void binary(int first, int second) {
        int b1 = first & second;
        System.out.println(b1);
        int b2 = first | second;
        System.out.println(b2);
        int b3 = first ^ second;
        System.out.println(b3);
        int b4 = first << second;
        System.out.println(b4);
        int b5 = first >> second;
        System.out.println(b5);
    }

    public static void logical(boolean first, boolean second) {
        boolean a = first && second;
        System.out.println(a);
        boolean b = first || second;
        System.out.println(b);
        boolean c = !first && !second;
        System.out.println(c);
        boolean d = !first || !second;
        System.out.println(d);
    }

    public static void condition(boolean condition) {
        if (condition) {
            System.out.println("Hello");

        } else {
            System.out.println("Bye");
        }
    }

    public static void ternary(boolean condition, int first, int second) {

        int a = condition ? first : second;
        System.out.println(a);
        int b = !condition ? first : second;
        System.out.println(b);
    }
}