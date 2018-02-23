public class NamedEntity {
    private String name;

    public NamedEntity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" + "name='" + name + '\'' + '}';
    }
}
