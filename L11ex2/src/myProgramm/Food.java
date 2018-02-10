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

    @Override
    public String toString() {
        return productName;
    }

    public void consume(Human human) {
        human.power = human.power + coefficient;
        System.out.println("Сила увеличилась :" + coefficient);
    }
}