package myProgramm;

import Shop.Good;
import Shop.Store;

import java.util.ArrayList;
import java.util.List;

import static Shop.Store.GOODS;

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
        this.money = 15f;
    }

    public static List<Good> PRODUCT = new ArrayList<Good>();

    public String toString() {
        System.out.println("Имя = " + name + "," + " Сила = " + power + "," + " Харизма = " + charisma + "," +
                " Ителлект = " + intelligence + "," + " Деньги = " + money);
        return null;
    }

    public void consumeAll(Human human) {
        for (Good i : GOODS) {
            i.consume(human);
//        for (int y = 0; y < GOODS.size(); y++){
//            GOODS.size().consume(human);
        }

    }
}
