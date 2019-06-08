package decoratorExcerciseRestaurantChef.meals;

public class RiceMeal implements Meal {
    @Override
    public void prepareMeal() {
        System.out.println("I prepare the rice dish");
    }
}
