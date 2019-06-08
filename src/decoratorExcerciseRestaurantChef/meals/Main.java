package decoratorExcerciseRestaurantChef.meals;

public class Main {
    public static void main(String[] args) {
        System.out.println("The new meal: ");

        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("The new meal: ");

        Meal potatoChickenWithSouceMeal = new SauceMealDecorator((new ChickenMealDecorator(new PotatoMeal())));
        potatoChickenWithSouceMeal.prepareMeal();
    }
}
