import java.util.Random;

public class Cell {

    public Animals animals;
    public boolean isClear = true;
    public int numbers = 2;

    public Cell(Animals animals) {

        this.animals = animals;
    }

    public void  makeCellDirty() {
        Random random = new Random();
        int n1 = random.nextInt(numbers + 1);
        if (1 == n1) {
            isClear = false;
        }
    }
}
