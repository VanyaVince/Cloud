public class Animal {
    public String type;
    public String name;

    public Animal(){

    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}