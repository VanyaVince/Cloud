public class App {
    public static void main(String[] args) {

        Car first = new Car();
        first.printInfo();
        first.fillTank(1000);
        first.move(5000);

        System.out.println();

        Car second = new Car("BMW", "X6", 80f, 14f);
        second.printInfo();
        second.fillTank(1000);
        second.move(5000);
    }
}
