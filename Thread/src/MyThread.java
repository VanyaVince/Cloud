public class MyThread extends Thread {
    private boolean isAllive;

    public MyThread(String name) {
        super(name);
    }

    void disable() {
        isAllive = false;
    }

    public MyThread() {
        isAllive = true;
    }


    @Override
    public void run() {
        System.out.printf("%s начал работу... \n", currentThread().getName());
        int counter = 1;
        while (isAllive) {
            System.out.println("Цикл: " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван");
            }
            System.out.printf("%s завершил работу... \n", currentThread().getName());
        }
    }
}