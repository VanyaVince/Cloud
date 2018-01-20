import static spark.Spark.get;
import static spark.Spark.post;

public class App {
    static Person vanya = new Person("Vanya",23);
    static Car audi = new Car("Audi", 2003);
    static Animal dog = new Animal("Dog", "Seva");

    public static void main(String[] args) {
        get("/view/person", (request, response) -> vanya.toString());
        get("/view/Car", (request, response) -> audi.toString());
        get("/view/Animal", (request, response) -> dog.toString());
    }

}
