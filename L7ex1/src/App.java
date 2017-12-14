public class App {
    public static void main(String[] args) {
//        print();
//        App main = new App();
//        main.dynamicPrint();
    //  Person lola = new Person("lola", "bola");
        Person john = new Person();
//        Person vasiliy = new Person("Василий", "Васильев");
        john.printMe();
//        Person.printPassort();
//        john.earn(18);
//        System.out.println(john.getUsDollars());
//        vasiliy.printMe();
//        Person.printPassort();
//        vasiliy.earn(5);
//        System.out.println(vasiliy.getUsDollars());
       //lola.printMe();
   //    lola.firstName = "ghj";
      // lola.printMe();
//        Person.printPassort();
//        lola.earn(12);
//        System.out.println(lola.getUsDollars());


//        john.getUsDollars();
//        vasiliy.getUsDollars();
//        lola.getUsDollars();
        Dog sharic = new Dog("lola");

//        sharic.eat(0.1F);
//        System.out.println(sharic.getWeight());
//        sharic.eat(0.2F);
//        System.out.println(sharic.getWeight());
//        sharic.eat(0.5F);
//        System.out.println(sharic.getWeight());

        sharic.eat("Meat", 0.2f);
        System.out.println(sharic.getWeight());
        sharic.poo();
        System.out.println(sharic.getWeight());
    }
}