import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {

    public List<Good> ProductsList = new ArrayList<>();
    public List<Account> ListOfAccounts = new ArrayList<>();
    public Map<Integer, Cart> Carts = new HashMap<>();
    public Map<Integer, Integer> goods = new HashMap<>();
    private int lastGoodId = 0;

    public Shop() {
        addGoodToShop("Apple", 2);
        addGoodToShop("Orange", 5);
        addGoodToShop("Banana", 3);

        ListOfAccounts.add(new Account("Steve Jobs", 1));
        ListOfAccounts.add(new Account("Bill Gates", 2));
    }

    public String getProductList() {
        String listOfGoods = " ";
        for (Good good : ProductsList) {
//            listOfGoods += String.format("%d: %s ($%d)<br/>", good.idGood, good.nameOfGood, good.price);
            listOfGoods += "" + good.idGood + ": " + good.nameOfGood + " ($" + good.price + ")" + " количество :" + goods.get(good.idGood) + " <br/>";
        }

        return listOfGoods;
    }

    public void addGoodToShop(String name, int price) {

        this.lastGoodId++;
        ProductsList.add(new Good(name, lastGoodId, price));
        addToGoodsCount(lastGoodId);
    }

    public void addToGoodsCount (int goodId){
        Integer count = goods.get(goodId);
        if (count == null){
            goods.put(goodId, 1);
        }else {
            goods.put(goodId, ++count);
        }
    }

    public Good findGoodById(int goodId) {
        for (Good good : ProductsList) {
            if (good.idGood == goodId) {
                return good;
            }
        }

        return null;
    }

    public Cart findCartForAccount(int accountId) {
        Cart cart = Carts.get(accountId);

        if (cart == null) {
            cart = new Cart();
        }

        return cart;
    }

    public void addToCart(int accountId, int goodId) {
        // добавить проверку есть ли товар с таким id в магазине
       Integer count = goods.get(goodId);
        if (count != null && count > 0) {

            Cart cart = findCartForAccount(accountId);

            cart.addGood(goodId);
            Carts.put(accountId, cart);
            Integer afterCount = goods.get(goodId);
            afterCount = afterCount - 1;
            goods.put(goodId, afterCount);
            System.out.println("Количество оставшихся товаров = " + goods.get(afterCount));
        }else {
            throw new IllegalArgumentException("Товара нет в магазине");

        }
    }


    public String showCartInfo(int accountId) {
        Cart cart = findCartForAccount(accountId);

        int summ = 0;
        String result = "";

        for (Map.Entry<Integer, Integer> entry : cart.goods.entrySet()) {
            int goodId = entry.getKey();
            int quantity = entry.getValue();
            Good good = findGoodById(goodId);
            int total = quantity * good.price;
            result += good.nameOfGood + " " + quantity + "x $" + good.price + " = " + total + "<br/>";
            summ += total;
        }

        result += "Общая сумма: " + summ + "<br/>";

        return result;
    }

    public void removeCart(int accountId) {

        Carts.remove(accountId);
    }

}