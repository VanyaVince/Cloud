import Shop.Store;
import myProgramm.Clothes;
import myProgramm.Food;
import myProgramm.Human;

public class App {
    public static void main(String[] args) {
        Human c = new Human();
       // c.toString();
        Store s1 = new Store();
        Food meat = new Food("Мясо", 14f,"стейк", 1.2f);
        Food meat1 = new Food("Мясо1", 16f,"стейк", 1.2f);
        Clothes c1 = new Clothes("Одежда", 20f, "Пальто", 5.5f);
        s1.buy(c, meat1);
    }
}
