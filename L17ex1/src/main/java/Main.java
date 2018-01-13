import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    static Controller controller = new Controller();

    public static void main(String[] args) {

        get("/getGoods", (request, response) -> {
            return controller.getGoodsList();
        });

        get("/addGoodToCart", (request, response) -> {
            int accountId = Integer.parseInt(request.queryParams("accountId"));
            int goodId = Integer.parseInt(request.queryParams("goodId"));
            return controller.addGoodToCart(accountId, goodId);
        });

        get("/buyCart", (request, response) -> {
            int accountId = Integer.parseInt(request.queryParams("accountId"));
            return controller.buyCart(accountId);
        });

        get("/addGoodToShop", (request, response) -> {
            String goodName = request.queryParams("goodName");
            int goodPrice = Integer.parseInt(request.queryParams("goodPrice"));
            controller.addGoodToShop(goodName, goodPrice);
            return "ok";
        });

        get("/addGoodsCount", (request, response) -> {
            int goodId = Integer.parseInt(request.queryParams("goodId"));
            controller.addGoodsCount(goodId);
            return "ok";
        });


    }

}
