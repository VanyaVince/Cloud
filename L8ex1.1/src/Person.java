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

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

}
