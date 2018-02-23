import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    private static List<Person> quest = new ArrayList<>(7);
    private static PersonUtils check = new PersonUtils();
    public static void main(String[] args) {

        quest.add(new Person("Vanya ", new Date(1404760000015L)));
        quest.add(new Person("Mark ", new Date(-865400000L)));
        quest.add(new Person("Bob ", new Date(1103760000015L)));
        quest.add(new Person("Michael ", new Date(-709808000033L)));
        quest.add(new Person("Slyvie ", new Date(140376000015L)));
        quest.add(new Person("Sten ", new Date(1203760000015L)));
        quest.add(new Person("Alison ", new Date(-809808000033L)));

        for (Person questParty : quest) {
            System.out.println("Гости вечеринки: " + questParty);
        }
        System.out.println();
        for(Person questPatry : quest) {
            try {
                check.checkAge(questPatry);
            } catch (NoProblemException e) {
                System.out.println(e.getMessage());

            }
        }
        check.printSuspects();
        System.out.println();

        try {
            check.checkSuspects();
        } catch (ThereIsAProblemException e) {
             System.out.println(e.getMessage());
            System.out.println("Всех в автозак");
        }
    }
}
