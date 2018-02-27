import static spark.Spark.get;

public class Controller {
    static ShopService shopService = new ShopService();

    public static void main(String[] args) {

        get("/getGoods", (request, response) -> {
            return shopService.getGoodsList();
        });

        get("/addGoodToCart", (request, response) -> {
            int accountId = Integer.parseInt(request.queryParams("accountId"));
            int goodId = Integer.parseInt(request.queryParams("goodId"));
            return shopService.addGoodToCart(accountId, goodId);
        });

        get("/buyCart", (request, response) -> {
            int accountId = Integer.parseInt(request.queryParams("accountId"));
            return shopService.buyCart(accountId);
        });

        get("/addGoodToShop", (request, response) -> {
            String goodName = request.queryParams("goodName");
            int goodPrice = Integer.parseInt(request.queryParams("goodPrice"));
            shopService.addGoodToShop(goodName, goodPrice);
            return "ok";
        });

        get("/addGoodsCount", (request, response) -> {
            int goodId = Integer.parseInt(request.queryParams("goodId"));
            shopService.addGoodsCount(goodId);
            return "ok";
        });
    }
}