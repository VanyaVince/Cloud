package Shop;

import myProgramm.*;

import java.util.Arrays;
import java.util.List;

public class Store {
    public static final List<Good> GOODS = Arrays.asList(new Food("Мясо", 16f, "стейк", 1.2f));
    //,new Clothes("Одежда", 7f, "Пальто", 7.7f));, new Book());

    public static void buy(Human human, Good product) {
        if (human.money < product.price) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException en) {
                System.out.println("Недостаточно средств");
            }
        } else if (!(check(product))) {
            try {
                throw new IllegalStateException();
            } catch (IllegalStateException en) {
                System.out.println("Товара нет в магазине");
            }
        } else {
            human.money -= product.price;
            System.out.println("Куплен продукт : " + GOODS + "Оставшиеся деньги : " + human.money);
            human.PRODUCT.add(product);
            GOODS.remove(product);
            product.owner = human;
        }

    }

    public static boolean check(Good product) {
        System.out.println("Что хочу купить :" + product.productName);
        for (int i = 0; i <= GOODS.size(); i++) {
            System.out.println("Что есть в магазине :" + GOODS.get(i).productName);
            if (GOODS.get(i).productName == product.productName) {
                return true;
            }
        }
        return false;
    }
}

