import Shop.Store;
import myProgramm.Clothes;
import myProgramm.Food;
import myProgramm.Human;

public class App {
    public static void main(String[] args) {
        Human c = new Human();
        Human a = new Human("Arfa", 55f, 34f, 45f, 66f);
        c.toString();
        try{
            Store.buy(c, "Мясо");
            Store.buy(a, "Рыба");
        }catch(IllegalStateException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        c.consumeAll();
        //a.consumeAll();
    }
}
