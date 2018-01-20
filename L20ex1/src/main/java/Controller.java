import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.post;

public class Controller {
    static ShopService service = new ShopService();
    private static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws IOException {

        get("/getAll", (request, response) -> {
            return service.getAll();
        });
        post("/addGoods", (request, response) -> {
            String body = request.body();
            List<Good> goods = mapper.readValue(body, new TypeReference<List<Good>>(){});
            service.addGoods(goods);
            return "ok";
        });
    }
}
