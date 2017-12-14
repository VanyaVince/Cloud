import java.util.Date;

public class App {
    public static void main(String[] args) {

        Person n1 = new Person("Stein ", new Date(776044800000L));
        Person n2 = new Person("Mark ", new Date(-865400000L));
        Person n3 = new Person("Stein ", new Date(776000000L));
        n1.printMe();
    }
}
