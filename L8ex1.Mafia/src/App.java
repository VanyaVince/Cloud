import java.util.HashSet;
import java.util.Set;

public class App {
    static Person game = new Person();
    private static int count = 0;
    public static final Set<Person> PLAYERS = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("Игроки :");
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("MAFIA"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("MAFIA"));
        for (Person people : PLAYERS) {
            count++;
            System.out.println(count + ")" + people.toString());
        }

        game.night(PLAYERS);
        for (Person people : PLAYERS) {
            count++;
            System.out.println(count + ")" + people.toString());

        }
    }
}
