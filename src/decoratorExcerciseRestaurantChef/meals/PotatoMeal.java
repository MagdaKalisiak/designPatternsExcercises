package decoratorExcerciseRestaurantChef.meals;

public class PotatoMeal implements Meal {

    @Override
    public void prepareMeal() {
        System.out.println("I prepare potato dish");
    }
}
