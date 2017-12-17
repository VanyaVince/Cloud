package myProgramm;

public class Food  extends Good {
    public Food (String name, float coefficient) {
        super(name, coefficient);
    }
    public void consume(Human human) {
        human.power = human.power + coefficient;
    }
}
