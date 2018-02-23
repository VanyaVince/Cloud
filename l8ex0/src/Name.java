import java.util.Arrays;

public class Name {

    public static void main (String[] args){
        NamedEntity n1 = new NamedEntity("Sedrick");
        NamedEntity n2 = new NamedEntity("Alison");
        NamedEntity n3 = new NamedEntity("Din");
        NamedEntity n4 = new NamedEntity("Samanta");
        NamedEntity n5 = new NamedEntity("Emma");

        Object [] name = new Object[5];
        name [0] = n1;
        name [1] = n2;
        name [2] = n3;
        name [3] = n4;
        name [4] = n5;
         for (Object aName : name) {

              System.out.println(aName);
         }
    }
}