import java.util.*;

public class PersonUtils {
    Long age18 = 567648000007L;
    Long age70 = 2207520000031L;

    private Date dateNow = new Date();

    public static final Set<Person> SUSPECTS = new HashSet<>();

    public void checkAge(Person person) {

        long periodBetween = dateNow.getTime() - person.birthDate.getTime();

        if (periodBetween < age18) {
            SUSPECTS.add((person));
        }
        if (periodBetween > age70) {
            throw new NoProblemException("Осторожно ветераны" + ": " + person.name);
        }
    }

    public void printSuspects() {
        System.out.println();
        System.out.println("Список несовершеннолетних");
        for (Person person : SUSPECTS) {
            System.out.println(person.toString());
        }
    }

    public void checkSuspects() throws ThereIsAProblemException {
        try {
            if (SUSPECTS.size() >= 3) {
                throw new ThereIsAProblemException("Несанкционированный митинг");
            }
        } finally {
            SUSPECTS.clear();
        }
    }
}