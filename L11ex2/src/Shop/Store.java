package Shop;

import myProgramm.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    public static final List<Good> GOODS = new ArrayList<>();
    static {
        GOODS.add(new Food("Мясо", 16f, "стейк", 1.2f));
        GOODS.add(new Food("Рыба", 16f, "стейк", 1.6f));
    }
    //,new Clothes("Одежда", 7f, "Пальто", 7.7f));, new Book());

    public static void buy(Human human, String productName) {
        Good product = null;
        for (Good i : GOODS) {
            if (i.productName == productName){
                product = i;
                break;
            }
        }
        if (product == null){
            throw new IllegalStateException("Товара нет в магазине");
        }
        if (human.money < product.price) {
            throw new IllegalArgumentException("Недостаточно средств");
        } else {
            human.money -= product.price;
            System.out.println("Куплен продукт " + product + "Человеком : " + human.name + " Оставшиеся деньги : " + human.money);
            human.PRODUCT.add(product);
            GOODS.remove(product);
            product.owner = human;
        }

    }

//    public static boolean check(Good product) {
//        System.out.println("Что хочу купить :" + product.productName);
//        for (int i = 0; i <= GOODS.size(); i++) {
//            System.out.println("Что есть в магазине :" + GOODS.get(i).productName);
//            if (GOODS.get(i).productName == product.productName) {
//                return true;
//            }
//        }
//        return false;
//    }
}

