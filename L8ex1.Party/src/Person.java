import java.util.Date;

public class Person {
    String name;
    Date birthDate;

    public Person() {
    }

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return name + ": " + birthDate;
    }
}