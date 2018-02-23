public class MyThread2 extends Thread {
    private Jesus jesus;

    MyThread2(Jesus jesus) {
        this.jesus = jesus;
    }

    @Override
    public void run() {
        try {
            jesus.fromLeftToRight();
            jesus.fromRightToLeft();
            System.out.printf("%s Количества в правой руке %d количесвто в левой руке %d \n", getName(), jesus.getRightHand(), jesus.getLeftHand());
        } catch (InterruptedException e) {
            System.out.println("Поток был приостановлен.");
        }
    }
}
