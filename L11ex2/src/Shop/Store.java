package Shop;
import myProgramm.*;
import java.util.Arrays;
import java.util.List;

public class Store {
    private static final List<Good> GOODS = Arrays.asList(new Good(), new Good());
//    myProgramm.Food meat = new myProgramm.Food("Steik", 4.0f);
//    myProgramm.Clothes coat = new myProgramm.Clothes("Пальто", 2.3f);
//    myProgramm.Book potter = new myProgramm.Book("Garry Potter", 1.3f);

    public static void buy(Human human, Product product) {
        if (human.money < product.price) {
            try {
                throw new IllegalStateException();
            } catch (IllegalStateException en) {
                System.out.println("Недостаточно средств");
            }
            // } else if ()
        }

    }
}
