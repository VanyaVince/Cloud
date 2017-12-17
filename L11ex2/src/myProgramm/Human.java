package myProgramm;

import Shop.Product;
import java.util.ArrayList;
import java.util.List;

public class Human {
    public String name = "Jeck";
    public float power = 5f;
    public float charisma = 3f;
    public float intelligence = 7f;
    public float money = 15f;

    public static List<Product> PRODUCT = new ArrayList<Product>();

    public String toString() {
        System.out.println("Имя = " + name + "," + " Сила = " + power + "," + " Харизма = " + charisma + "," +
                " Ителлект = " + intelligence + "," + " Деньги = " + money);
        return null;
    }
    public void consumeAll( ){

    }
}
