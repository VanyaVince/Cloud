import java.util.Random;

public class Animals {

    public String name;
    public int fullness = 100;
    public int fullnessComsuption = 10;

    public Animals(){}

    public Animals(String name,int fullnessComsuption) {
        this.fullnessComsuption = fullnessComsuption;
        this.name = name;
    }

    public void feed(int foodValue) {
        this.fullness = this.fullness + foodValue;
    }

    public void timeRun(int hours) {
        this.fullness = this.fullness - this.fullnessComsuption * hours;
        if (this.fullness < 0) {
            this.fullness = 0;
        }
    }
}