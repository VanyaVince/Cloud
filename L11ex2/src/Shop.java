package shopPackage;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private static final List<Good> GOODS = Arrays.asList(new Good(), new Good());
    Food meat = new Food("Steik", 4.0f);
    Clothes coat = new Clothes("Пальто", 2.3f);
    Book potter = new Book("Garry Potter", 1.3f);

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
