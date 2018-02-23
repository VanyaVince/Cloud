public class Cleaners {
    public String name;
    public String lastName;
    public int money;

    public Cleaners(String name, String lastName, int money) {
        this.name = name;
        this.lastName = lastName;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                '}';
    }
}
