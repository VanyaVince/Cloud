public class People {

    public String name;
    public String lastName;
    public int mood = 2;
    public int money = 15;

    public People(String name, String lastName, int mood, int money) {
        this.name = name;
        this.lastName = lastName;
        this.mood = mood;
        this.money = money;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mood=" + mood +
                ", money=" + money +
                '}';
    }
    public String getName(int i) {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMood() {
        return mood;
    }

    public int getMoney() {
        return money;
    }
}
