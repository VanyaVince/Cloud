package myProgramm;

import Shop.Good;
import Shop.Store;

import java.util.ArrayList;
import java.util.List;

public class Human {

    public String name;
    public float power = 5f;
    public float charisma = 3f;
    public float intelligence = 7f;
    public float money = 15f;

    public Human(String name, float power, float charisma, float intelligence, float money) {
        this.name = name;
        this.power = power;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.money = money;
    }

    public Human() {
        this.name = "Jeck";
        this.power = 5f;
        this.charisma = 3f;
        this.intelligence = 7f;
        this.money = 115f;
    }

    public static List<Good> PRODUCT = new ArrayList<Good>();

    public String toString() {
        return "Имя = " + name + "," + " Сила = " + power + "," + " Харизма = " + charisma + "," +
                " Ителлект = " + intelligence + "," + " Деньги = " + money;
    }

    public void consumeAll() {
        //System.out.println("Before:" + this);
        List<Good> consumed = new ArrayList<>();
        for (Good i : PRODUCT) {
            if (i.getOwner() == this){
                i.consume(this);
                consumed.add(i);
            }
        }
        for (Good good: consumed) {
            PRODUCT.remove(good);
            System.out.println("Съелось :" + good);
        }

        //System.out.println("After: " + this);

    }
}
