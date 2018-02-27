import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonUtils {
    private static Random random = new Random();
    private static final List<String> FIRST_NAME = new ArrayList<>();
    private static final List<String> LAST_NAME = new ArrayList<>();

    static {
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
    }

    private static void addToListFirstName(String firstName) {

        FIRST_NAME.add(firstName);
    }

    private static void addToListLastName(String lastName) {

        LAST_NAME.add(lastName);
    }

    public String randomFirstName() {
        int randomFirstName = random.nextInt(FIRST_NAME.size());
        return FIRST_NAME.get(randomFirstName);
    }

    public String randomLastName() {
        int randomFirstName = random.nextInt(LAST_NAME.size());
        return LAST_NAME.get(randomFirstName);
    }

}