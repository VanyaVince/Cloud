public class App {

    public static void main(String[] args) {
        Jesus jesus = new Jesus();
        for (int i = 1; i <= 7; i++) {
            Thread t = new MyThread2(jesus);
            t.setName("Поток:" + i);
            t.start();
        }
    }
}