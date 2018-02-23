public class People {

    public String name;
    public String lastName;
    public int mood = 0;
    public int hoursToNextVisit = 0;

    public People(String name, String lastName, int mood, int hoursToNextVisit) {
        this.name = name;
        this.lastName = lastName;
        this.mood = mood;
        this.hoursToNextVisit = hoursToNextVisit;
    }

    public void changeMoodUp() {
        this.mood++;
        if (this.mood > 3) {
            this.mood = 3;
        }
    }

    public void changeMoodDown() {
        this.mood--;
    }

    public void calcNextVisit() {
        this.hoursToNextVisit = 24 - mood * 2;
    }

    public void visitZoo(Zoo zoo) {

        if (this.hoursToNextVisit == 0) {
            zoo.moneyZoo = zoo.moneyZoo + zoo.ticketPrice;

            boolean happiness = true;
            for (Cell cell : zoo.CellsAnimals) {
                if (!cell.isClear) {
                    happiness = false;
                }
            }

            if (happiness) {
                changeMoodUp();
                System.out.println(this.name + " Посетил зоопарк, остался доволен");
            } else {
                changeMoodDown();
                System.out.println(this.name + " Посетил зоопарк, остался недоволен");
            }
            System.out.println("Настроени " + this.mood);
            zoo.printMoney();

            calcNextVisit();
        } else {
            hoursToNextVisit--;
        }
    }
}