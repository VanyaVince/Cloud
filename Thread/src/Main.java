public class Main {

    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        MyThread t = new MyThread("Мой поток");
        new Thread(t, "Мой поток").start();
        //t.start();
        try {
            Thread.sleep(1100);

            t.disable();

            Thread.sleep(1000);
          //  t.join();
        } catch (InterruptedException e) {
            System.out.printf("Поток %s прерван", t.getName());

    }
        System.out.println("Главный поток закончил работу...");
    }
}
