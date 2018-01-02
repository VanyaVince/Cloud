import java.util.Random;

public class Animals {

    public String type;
    public int age;


    public Animals(String type, int age) {
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {

        return type + age;
    }


}
