import java.util.*;

public class Condition {
    private static Random random = new Random();

    private boolean checkRandom = true;

    public void night(Set<Person> persons) {
//      for(Person person : persons){
//            if (Objects.equals(person.profession, "CIVILIAN")){
//                persons.remove(person);
//                System.out.println();
//                System.out.println("Был убит(а) мафией: " + person.firstName + " " + person.lastName);
//                break;
//            }
//        }
        List<Person> playGame = new ArrayList<>(persons);
        while (checkRandom) {
            int numberRandom = random.nextInt(playGame.size());
            Person person = playGame.get(numberRandom);
            if (person.profession.equals("CIVILIAN")) {
                System.out.println();
                System.out.println("Ночью был убит(а) мафией: " + playGame.get(numberRandom));
                System.out.println();
                playGame.remove(numberRandom);
                checkRandom = false;
            }
        }
        checkRandom = true;
        App.PLAYERS = new HashSet<>(playGame);
    }

    public void day(Set<Person> persons) {
        List<Person> playGame = new ArrayList<>(persons);
        int numberRandom = random.nextInt(playGame.size());
        System.out.println();
        System.out.println("Днём был убит(а) " + playGame.get(numberRandom));

        playGame.remove(numberRandom);

        App.PLAYERS = new HashSet<>(playGame);
    }


    public boolean checkGameState(Set<Person> persons) {
        int countCivilian = 0;
        int countMafia = 0;

        for (Person personCivilian : persons) {
            if (personCivilian.profession.equals("CIVILIAN")) {
                countCivilian++;
            }
        }
        for (Person personMafia : persons) {
            if (personMafia.profession.equals("MAFIA")) {
                countMafia++;
            }
        }
        if (countMafia >= countCivilian) {
            System.out.println();
            System.out.println("Мафия победила");
            return true;
        } else if (countMafia == 0) {
            System.out.println();
            System.out.println("Мафия проиграла");
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(Set<Person> persons) {
        int count = 0;
        for (Person person : persons) {
            count++;
            System.out.println(count + ")" + person.toString());
        }
    }
}
