import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Shop shop;

    public Controller(){
        shop = new Shop();
    }

    public String getGoodsList() {

        return shop.getProductList();
    }

    public String addGoodToCart(int accountId, int goodId) {
        try {
            shop.addToCart(accountId, goodId);
            return "ok";
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            return e.getMessage();
        }
    }

    public String buyCart(int accountId) {
        String result = shop.showCartInfo(accountId);
        shop.removeCart(accountId);
        return result;
    }

    public void addGoodToShop(String goodName, int goodPrice) {

       shop.addGoodToShop(goodName, goodPrice);
    }

    public void addGoodsCount(int goodId) {

       shop.addToGoodsCount(goodId);
    }
}
