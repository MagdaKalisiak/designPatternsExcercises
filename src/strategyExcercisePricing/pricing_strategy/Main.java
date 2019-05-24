package strategyExcercisePricing.pricing_strategy;

import strategyExcercisePricing.PriceCalculator;

public class Main {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        //nie jest zapisany - normalna cena
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.printCalculation(100, false);
        //jest zapisany -ale próbujemy normalną cenę
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.printCalculation(100, true);

    }
}
