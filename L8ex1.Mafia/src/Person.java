import java.util.*;

public class Person {
    private static Random random = new Random();

    private static final List<String> FIRST_NAME = new ArrayList<>();
    private static final List<String> LAST_NAME = new ArrayList<>();

    private String firstName;
    private String lastName;
    String profession;


    Person(String profession) {
        addToListFirstName("Kirill");
        addToListFirstName("Darya");
        addToListFirstName("Roma");
        addToListFirstName("Vanya");
        addToListFirstName("Katya");
        addToListFirstName("Vera");
        addToListFirstName("Sergei");

        addToListLastName("Zabelich");
        addToListLastName("Shnip");
        addToListLastName("Masel");
        addToListLastName("Sviridovich");
        addToListLastName("Makarchyk");
        addToListLastName("Novak");
        addToListLastName("Radionchik");

        this.profession = profession;
        int firstList = random.nextInt(FIRST_NAME.size());
        this.firstName = FIRST_NAME.get(firstList);
        int lastList = random.nextInt(LAST_NAME.size());
        this.lastName = LAST_NAME.get(lastList);
    }

    private void addToListFirstName(String firstName) {

        FIRST_NAME.add(firstName);
    }

    private void addToListLastName(String lastName) {

        LAST_NAME.add(lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", статус: " + profession;
    }
}
