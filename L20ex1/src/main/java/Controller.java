import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.util.List;

import static spark.Spark.get;
import static spark.Spark.post;

public class Controller {
    static ShopService service = new ShopService();
    private static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) {

        get("/getAll", (request, response) -> {
            return service.getAll();
        });
        post("/addGoods", (request, response) -> {
            String body = request.body();
            List<Good> newGoods = mapper.readValue(body, new TypeReference<List<Good>>(){});
            service.addGoods(newGoods);
            return "ok";
        });
    }
}
