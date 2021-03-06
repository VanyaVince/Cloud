public class App {
    private static int sum = 0;

   private static void print(Integer... obj) {
       for (Integer anObj : obj) {
           System.out.print(anObj.toString() + " ");
       }
        System.out.println();
    }

    private static Integer sum(Integer first, Integer second) {
        return first + second;
    }

    public static void main(String[] args) {
        Integer first = 24;
        Integer second = 1;
        Integer third = 56;
        Integer fourth = sum(first, second);
        Integer fifth = sum(first, second) + sum(third, fourth);
        Integer sixth = sum(first, sum(second, third));
        Integer seven = 10 + sum(first, 6) - sum(second, 3);
        Integer eights = sum(first - 10, second + 5);
        App ss = new App();

        print(first);
        print(first, second);
        print(first, second, third);
        print(fourth);
        print(fifth);
        print(sixth);
        print(seven);
        print(eights);
        print(sum(first, second));
        print(sum(first + 4,0));
    }

}