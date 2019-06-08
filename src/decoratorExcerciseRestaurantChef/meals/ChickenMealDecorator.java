package decoratorExcerciseRestaurantChef.meals;

public class ChickenMealDecorator extends MealDecorator {
    public ChickenMealDecorator(Meal mealToBeDecorated) {
        super(mealToBeDecorated);
    }

    @Override
    public void prepareMeal() {
        mealToBeDecorated.prepareMeal();
        addChicken();

    }

    private void addChicken() {
        System.out.println("I add the chicken to the meal");
    }
}
