public class Clothes extends Good {
    public Clothes (String name, float coefficient) {
        super(name, coefficient);
    }
    public void consume(Human human) {
        human.charisma = human.charisma * coefficient;

    }
}
