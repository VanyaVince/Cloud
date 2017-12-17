package myProgramm;

public class Book extends Good {
    public Book (String name, float coefficient) {
        super(name, coefficient);
    }
    public void consume(Human human) {
        human.intelligence = human.intelligence * coefficient;

    }
    }

