public class Jesus {

    private int leftHand = 1;
    private int rightHand = 0;

    void fromLeftToRight() throws InterruptedException {

        if (leftHand > 0) {
            Thread.sleep(500);
            rightHand++;
            leftHand--;
        }
    }

    void fromRightToLeft() throws InterruptedException {

        if (rightHand > 0) {
            Thread.sleep(500);
            leftHand++;
            rightHand--;
        }
    }

    int getLeftHand() {
        return leftHand;
    }

    int getRightHand() {
        return rightHand;
    }

}