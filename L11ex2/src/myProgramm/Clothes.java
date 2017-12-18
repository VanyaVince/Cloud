package myProgramm;

import Shop.Good;

public class Clothes extends Good {
    public String name;
    public float coefficient;

    public Clothes(String productName,float price, String name, float coefficient) {
        super(productName, price);

        this.name = name;
        this.coefficient = coefficient;
    }
    public void consume(Human human) {
        human.charisma = human.charisma * coefficient;

    }
}
