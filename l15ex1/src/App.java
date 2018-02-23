import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int time = 1;
        List<People> visitors = new ArrayList<>();
        Zoo zoo = new Zoo(20);
        zoo.addAnimal(new Animals("Шарик", 10));
        zoo.addAnimal(new Animals("Жора", 15));
        zoo.addAnimal(new Animals("Бульдог", 20));

        visitors.add(new People("Vanya", "Sviridovich", 0, 0));
        visitors.add(new People("t1", "t1", 0, 3));
        visitors.add(new People("t2", "t2", 0, 15));
        visitors.add(new People("t3", "t3", 0, 10));


        while (zoo.moneyZoo >= 0) {
            System.out.println("Часов прошло: " + time);
            zoo.timeRun(1);

            for (People visitor : visitors){
                visitor.visitZoo(zoo);
            }

                if (time % 8 == 0) {
                    zoo.cleanCells();
                }
            time++;
        }
        System.out.println("Зоопарк перестал существовать, бюджет = " + zoo.moneyZoo);
    }
}
