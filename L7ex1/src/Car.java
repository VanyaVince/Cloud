public class Car {
    private final String make;
    private final String model;
    private final float tankCapacity;
    private final float fuelConsumption;
    private float fuelInTank = 0;
    private float milleage = 0;

    public Car() {
        this.make = "Audi";
        this.model = "A5";
        this.tankCapacity = 55.0f;
        this.fuelConsumption = 6f;

    }

    public Car(String make, String model, float tankCapacity, float fuelConsumption) {
        this.make = make;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;

    }

    public void printInfo() {
        System.out.println("Марка машины: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Объем бака: " + tankCapacity);
        System.out.println("Расход топлива: " + fuelConsumption);
        System.out.println("Топлива в баке: " + fuelInTank);
        System.out.println("Пробег: " + milleage);
    }


    public void fillTank(float amount) {

        try {
            this.fuelInTank = this.fuelInTank + amount;
            if (this.fuelInTank > this.tankCapacity) {
                float total = this.fuelInTank - this.tankCapacity;
                this.fuelInTank = this.tankCapacity;
                throw new IllegalArgumentException("Количесвто лишнего топлива: " + total);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public float move(int distance) {

        float fuel = fuelConsumption / 100 * distance;

        if (fuel <= this.fuelInTank) {

            this.fuelInTank -= fuel;
            this.milleage += distance;
            return fuel;
        } else {
            fuel = this.fuelInTank;
            float distance2 = fuel / (fuelConsumption / 100);
            this.milleage = this.milleage + distance2;
            this.fuelInTank = 0;
            try {
                throw new IllegalArgumentException("Потраченно топлива: " + fuel + "\nПройденное расстояние: " + distance2);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            return fuel;
        }
    }

}