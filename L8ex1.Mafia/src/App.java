import java.util.HashSet;
import java.util.Set;

public class App {
    private static final Set<Person> PLAYERS = new HashSet<>();
    public static void main(String[] args) {
//        Person.FIRST_NAME.add("Kirill");
//        Person.FIRST_NAME.add("Darya");
//        Person.FIRST_NAME.add("Roma");

        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("MAFIA"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("MAFIA"));
        for (Person people : PLAYERS) {
            System.out.println(people.toString());
        }
    }
}
