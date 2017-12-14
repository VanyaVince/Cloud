public class Person {
    private String firstName;
    private String lastName;
    private int usDollars = 0;

    public Person(String firtName, String lastName) {
//        this.firstName = firtName;
//        this.lastName = lastName;
    }

    public Person() {
        firstName = "John";
        lastName = "Doe";
    }

    public void printMe() {
        System.out.println(firstName + " " + lastName);
    }

    public static void printPassort() {
        System.out.println("Ухо, ноги, без хвоста");

    }

    public int getUsDollars() {
        return usDollars;
    }

    public void earn(int emound) {
        usDollars += emound;
    }
}
