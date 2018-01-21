import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class PersonUtils {
    private static Date age18;

    PersonUtils() {
    }

    private PersonUtils(Date age18) {
        PersonUtils.age18 = new Date(567648000007L);
    }

    private static final Set<Person> SUSPECTS = new HashSet<>();


    public void checkAge(Person person){
        if (person.birthDate.after(age18)){
            System.out.println(person.getName());
        }
    }
}
