public class Car {
    public String model;
    public int yearOfIssue;

    public Car(){
    }
    public Car(String model, int yearOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
