import java.util.*;

public class Person {
    private Random random = new Random();

    static final List<String> FIRST_NAME = new ArrayList<>();
    private static final List<String> LAST_NAME = new ArrayList<>();

    String firstName;
    String lastName;
    String profession;

    public Person (String profession){
        this.profession = profession;
        int firstList = random.nextInt(FIRST_NAME.size());
        this.firstName = FIRST_NAME.get(firstList);
        int lastList = random.nextInt(LAST_NAME.size());
        this.lastName = LAST_NAME.get(lastList);

        FIRST_NAME.add("Kirill");
        FIRST_NAME.add("Darya");
        FIRST_NAME.add("Roma");
        FIRST_NAME.add("Vanya");
        FIRST_NAME.add("Katya");
        FIRST_NAME.add("Vera");
        FIRST_NAME.add("Sergei");

        LAST_NAME.add("Zabelich");
        LAST_NAME.add("Shnip");
        LAST_NAME.add("Masel");
        LAST_NAME.add("Sviridovich");
        LAST_NAME.add("Makarchyk");
        LAST_NAME.add("Novak");
        LAST_NAME.add("Radionchik");
    }

//    public void addToListFirstName(String firstName){
//        FIRST_NAME.add(firstName);
//    }
//    public void addToListLastName(String lastName){
//        FIRST_NAME.add(lastName);
//    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

}
