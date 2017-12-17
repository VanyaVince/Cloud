package Shop;

import myProgramm.*;

//package shopPackage;
public abstract class Product {
    protected String name;
    protected float price;
    protected Human owner;

    public Product(String name) {

        this.name = name;
    }

    public abstract void consume(Human human);
}
