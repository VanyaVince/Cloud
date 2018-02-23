public class Mouse extends Creature {
    public Mouse(String title, float mass, int consumePercentage) {
        super(title, mass, consumePercentage);
    }

    public void consume(Creature victim) {

        if (victim instanceof Bug) {
            mass = mass + victim.mass / 100 * consumePercentage;
            System.out.println(title + " " + "eat " + " " + victim.getTitle() + " " + "Mass title = " + mass);
        } else {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex) {
                System.out.println("Поедание невозможно");
            }
        }
    }
}
