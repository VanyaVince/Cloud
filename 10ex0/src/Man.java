public final class Man extends Creature {

    private final String firstName;
    private final String lastName;

    public Man() {
        this.firstName = "Sten";
        this.lastName = "Crower";
    }

    public Man(String title, float mass, int consumePercentage, String firstName, String lastName) {
        super(title, mass, consumePercentage);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void consume(Creature victim) {
        if (victim instanceof Chicken) {
            mass = mass + victim.mass / 100 * consumePercentage;
            System.out.println(title + " " + "eat " + " " + victim.getTitle() + " " + "Mass title = " + mass);
        } else {
            try {

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Поедание невозможно");

            }
        }
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }
}
