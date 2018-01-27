import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.post;

public class Controller {
    private static ShopService service = new ShopService();
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        get("/getAll", (request, response) -> {
            String json = mapper.writeValueAsString(service.getAll());
            return json;
        });
        post("/addGoods", (request, response) -> {

            try {
                String body = request.body();
                List<Good> goods = mapper.readValue(body, new TypeReference<List<Good>>() {
                });
                service.addGoods(goods);
                return "ok";
            } catch (JsonParseException | JsonMappingException e) {
                e.printStackTrace();
            }

            return "error";
        });
        post("/buyGoods", (request, response) -> {

            try {
                String body = request.body();
                List<Good> goods = mapper.readValue(body, new TypeReference<List<Good>>() {
                });
                service.buyGoods(goods);
                return "ok";
            } catch (JsonParseException | JsonMappingException e) {
                e.printStackTrace();
            }

            return "error";
        });
    }
}
