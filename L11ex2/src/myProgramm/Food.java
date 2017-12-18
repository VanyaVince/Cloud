package myProgramm;

import Shop.Good;

public class Food extends Good {
    public String name;
    public float coefficient;

    public Food(String productName, float price, String name, float coefficient) {
        super(productName, price);

        this.name = name;
        this.coefficient = coefficient;
    }

    public void consume(Human human) {
        human.power = human.power + coefficient;
    }
}
