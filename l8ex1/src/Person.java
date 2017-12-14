import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private static final Set<Person> SUSPECTS = new HashSet<>();
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void printMe() {
        System.out.println(this.name + "" + this.birthDate);
    }

    public String getName() {

        return name;
    }

    public Date getbirthDate() {

        return birthDate;
    }


}

