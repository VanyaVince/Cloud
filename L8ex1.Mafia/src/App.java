import java.util.HashSet;
import java.util.Set;

public class App {
    private static Game game = new Game();
    static Set<Person> PLAYERS = new HashSet<>();

    public static void main(String[] args) {
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("MAFIA"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));
        PLAYERS.add(new Person("CIVILIAN"));

        System.out.println("Игроки :");
        game.printInfo(PLAYERS);

        while (true) {

            game.night(PLAYERS);

            game.printInfo(PLAYERS);

            if (game.checkGameState(PLAYERS)) {
                System.out.println();
                System.out.println("Игра окончена");
                break;
            }

            game.day(PLAYERS);

            if (game.checkGameState(PLAYERS)) {
                System.out.println();
                System.out.println("Игра окончена");
                break;
            }
        }
    }
}
