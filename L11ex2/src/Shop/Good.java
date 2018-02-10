package Shop;

import myProgramm.*;

public abstract class Good {

    protected String productName;
    protected float price;
    protected Human owner;

    public Good(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public Human getOwner() {
        return owner;
    }

    public abstract void consume(Human human);
}