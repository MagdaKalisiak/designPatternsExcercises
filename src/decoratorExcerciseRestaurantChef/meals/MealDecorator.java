package decoratorExcerciseRestaurantChef.meals;

public abstract class MealDecorator implements Meal {
    protected Meal mealToBeDecorated;

    public MealDecorator(Meal mealToBeDecorated) {
        this.mealToBeDecorated = mealToBeDecorated;
    }
}
