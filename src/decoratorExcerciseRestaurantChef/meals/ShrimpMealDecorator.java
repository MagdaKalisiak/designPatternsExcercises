package decoratorExcerciseRestaurantChef.meals;

class ShrimpMealDecorator extends MealDecorator{


    public ShrimpMealDecorator(Meal mealToBeDecorated) {
        super(mealToBeDecorated);
    }

    @Override
    public void prepareMeal() {
        mealToBeDecorated.prepareMeal();
        addShrimps();


    }

    private void addShrimps() {
        System.out.println("I add shrimps to the meal");
    }
}
