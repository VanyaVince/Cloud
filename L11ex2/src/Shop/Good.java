package Shop;
import myProgramm.*;
public abstract class Good  {

    protected String productName;



    protected float price;
    protected Human owner;


    public Good(String productNamename, float price) {

        this.productName = productName;
        this.price = price;
    }


    public abstract void consume(Human human);

    }






