package decoratorExcerciseRestaurantChef.meals;


public class SauceMealDecorator extends MealDecorator {

    public SauceMealDecorator(Meal mealToBeDecorated) {
        super(mealToBeDecorated);
    }

    @Override
    public void prepareMeal() {
        mealToBeDecorated.prepareMeal();
        addSauce();

    }

    private void addSauce() {
        System.out.println("I add souce");
    }
}
