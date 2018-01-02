import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public int moneyZoo = 0;
    public int ticketPrice = 4;
    public static List<Cell> CellsAnimals = new ArrayList<>();

    static {
        CellsAnimals.add(new Cell(new Tiger("Животное", 5, "Гном", "Рыжий")));
        CellsAnimals.add(new Cell(new Wolf("Животное", 10, "Хвостик", "Безухий")));
    }

    public static List<People> Visitors = new ArrayList<>();

    static {
        Visitors.add(new People("Misha", "Karpov", 2, 15));
        Visitors.add(new People("Vanya", "Sviridovich", 2, 14));
//        Visitors.add(new People("Alex", "Ershov"));
    }

    public void walkToCells() {
        for (People person : Visitors) {

            while (person.mood > 0 && person.money > ticketPrice) {
                person.money = person.money - ticketPrice;
                moneyZoo = moneyZoo + ticketPrice;
                if (person.money < ticketPrice) {
                    System.out.println("У туриста закончились деньги - " + person.money);
                    break;
                    for (Cell cell : CellsAnimals) {
                        cell.makeCellDirty();
                        System.out.println(person.toString());
                        if (!cell.isClear) {
                            person.mood--;
                        } else {
                            person.mood++;
                        }
                        if (person.mood == 0) {
                            System.out.println("Турист остался недоволен, увидев большое количесвто отходов, оставшиешься деньги : " + person.money);
                            break;
                        }
                    }
                }
            }
            System.out.println("Зоопарк разаботал :" + moneyZoo + " " + "долларов");
        }
    }
}


//        public void cellCleaning () {
//
//        }
//}

