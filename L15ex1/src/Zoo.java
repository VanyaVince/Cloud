import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Zoo {

    public int moneyZoo = 0;
    public int ticketPrice = 4;
    public int salary = 2;

    public Zoo(int moneyZoo) {
        this.moneyZoo = moneyZoo;
    }

    public void addAnimal(Animals animal) {

        this.CellsAnimals.add(new Cell(animal));
    }

    public List<Cell> CellsAnimals = new ArrayList<>();



    public void timeRun(int hours) {
        for (Cell cell : CellsAnimals) {
            //изменяет состояние сытости
            cell.animal.timeRun(hours);

            if (cell.animal.fullness == 0) {
                Random random = new Random();
                int foodValue = random.nextInt(40) + 60;
                cell.animal.feed(foodValue);

                cell.isClear = false;
                System.out.println(cell.animal.name + " сходило в туалет");
            }
        }
    }

    public void cleanCells() {
        for (Cell cell : CellsAnimals) {
            if (!cell.isClear) {
                cell.isClear = true;
                moneyZoo = moneyZoo - salary;
                System.out.println("Убраны отходы в клетке " + cell.animal.name);
                printMoney();
            }
        }
    }

    public void printMoney() {
        System.out.println("Бюджет зооапрка " + moneyZoo);
    }
}