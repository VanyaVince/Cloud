import java.util.HashMap;
import java.util.Map;

public class Cart {

    public Map<Integer, Integer> goods = new HashMap<>();

    public void addGood(int goodId){
        int quantity = 0;

        if (goods.containsKey(goodId)){
            quantity = goods.get(goodId);
        }

        quantity++;
        goods.put(goodId, quantity);
        System.out.println("добавлен товар: " + goodId + " в корзину");
    }
}
