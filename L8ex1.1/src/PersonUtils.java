import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PersonUtils {
    private Date dateNow = new Date();


    private static final Set<Person> SUSPECTS = new HashSet<>();


    public void checkAge(Person person) {
        long periodBetween = dateNow.getTime() - person.birthDate.getTime();
        Long age18 = 567648000007L;
        Long age70 = 2207520000031L;
        //  System.out.println(dateNow.toString());
        if (periodBetween < age18) {
            SUSPECTS.add(person);
        }
        try {
            if (periodBetween > age70) {
                throw new NoProblemException("Осторожно ветераны");
            }

        } catch (NoProblemException e) {
            e.getMessage();
        }
    }

    public void checkSuspects () {
        try {
            if (SUSPECTS.size() >= 3) {
                System.out.println("Несанкционированный митинг");
            }
        }finally {
            SUSPECTS.clear();
            System.out.println("Всех в автозак");
            System.out.println(Arrays.toString(SUSPECTS.toArray()));
        }
    }
    public void printSuspects() {
        System.out.println("Список несовершеннолетних");
        for (Person person : SUSPECTS) {
            System.out.println(person.toString());
        }
    }
}