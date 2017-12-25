package Shop;
import myProgramm.*;
public abstract class Good  {

    protected String productName;



    protected float price;

    public Human getOwner() {
        return owner;
    }

    protected Human owner;


    public Good(String productName, float price) {

        this.productName = productName;
        this.price = price;
    }


    public abstract void consume(Human human);

    }






