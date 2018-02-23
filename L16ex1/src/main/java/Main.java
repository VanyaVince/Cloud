import static spark.Spark.get;
import static spark.Spark.post;

public class Main {

    public static void main(String[] args) {
        final Model model = Model.read ();
        get("/view", (request, response) -> model.getMessages());
        post("/simplePost", (request, response) -> model.addMessage(request.body()));
    }
}
