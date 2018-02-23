public class Person {

    private static final PersonUtils personU = new PersonUtils();
    private String firstName;
    private String lastName;
    private String profession;


    Person(String profession) {
        this.profession = profession;
        this.firstName = personU.randomFirstName();
        this.lastName = personU.randomLastName();
    }

    public String getProfession() {
        return profession;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", статус: " + profession;
    }
}