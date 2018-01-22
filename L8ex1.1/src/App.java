
import java.util.Date;

public class App {
    public static void main(String[] args) {

        PersonUtils check = new PersonUtils();

        Person Vanya = new Person("Vanya ", new Date(756864000000L));
        Person Mark = new Person("Mark ", new Date(-865400000L));
        Person Bob = new Person("Bob ", new Date(1103760000015L));
        Person Michael = new Person("Michael", new Date(-709808000033L));
        Person Slyvie = new Person("Slyvie", new Date(1403760000015L));
        Person Sten = new Person("Sten", new Date(1003760000015L));
        Person Alison = new Person("Alison", new Date(-809808000033L));

        check.checkAge(Vanya);
        check.checkAge(Mark);
        check.checkAge(Bob);
        check.checkAge(Michael);
        check.checkAge(Slyvie);
        check.checkAge(Sten);
        check.checkAge(Alison);
        check.printSuspects();
        check.checkSuspects();
    }
}
