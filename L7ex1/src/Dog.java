public class Dog {
    private static final float FOOD_TO_EAT = 0.2F;

    private String firstName;
    private float weight;
    private float currentFood = 0;
    private float currentStomadeWeight = 0;

    // construct
    public Dog(String firstName) {
        this.firstName = firstName;
        this.weight = 0.5F;
    }


    public void eat(String foodName, float foodweight) {
       eat(foodweight);
        System.out.println(foodName);
    }

    public float poo() {
        currentStomadeWeight = 0;
        float pooWeight = currentStomadeWeight;
        return pooWeight;
    }

    public void eat(float... food) {
        for (int i = 0; i < food.length; i++) {
            currentStomadeWeight += food[i];
        }
    }


    //get/set
    public float getWeight() {

        return weight + currentStomadeWeight;
    }


}
//IlledalArgumentException ("Слишком много съедено).
