package myProgramm;

import Shop.Good;

public class Book extends Good {

    public String name;
    public float coefficient;

    public Book(String productName, float price, String name, float coefficient) {
        super(productName, price);
        this.name = name;
        this.coefficient = coefficient;
    }

    public void consume(Human human) {
        human.intelligence = human.intelligence * coefficient;
    }
}

