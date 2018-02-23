public abstract class Creature {

    protected String title;
    protected float mass;
    protected final int consumePercentage;

    public Creature() {
        this.title = "Существо";
        this.consumePercentage = 10;
    }

    public Creature(String title, float mass, int consumePercentage) {
        this.title = title;
        this.mass = mass;
        this.consumePercentage = consumePercentage;
    }

    public abstract void consume(Creature creature);

    public String getTitle() {
        return title;
    }

    public float getMass() {
        return mass;
    }

    public int getConsumePercentage() {
        return consumePercentage;
    }
    public static void main(String[] args) {
           Mouse kr = new Mouse("Mouse", 3.5f, 10);
           Bug juck = new Bug("Bug", 0.7f, 10 );
           Man human = new Man("Man", 80f, 10, "Alison", "Swont");
           Dog bobik = new Dog("Dog", 10f, 10);
           Cat mr = new Cat("Cat", 7.5f, 10);
           Chicken kyr = new Chicken("Chiken", 6.0f, 10);
           bobik.consume(human);
           bobik.consume(juck);
           human.consume(kyr);
           human.consume(bobik);
           kr.consume(juck);
    }

}