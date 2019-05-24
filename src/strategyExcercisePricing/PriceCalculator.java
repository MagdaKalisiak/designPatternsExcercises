package strategyExcercisePricing;

import strategyExcercisePricing.pricing_strategy.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public void printCalculation(int price, boolean isSignedToNewsletter) {
        int priceCalculated = pricingStrategy.calculatePrice(price, isSignedToNewsletter);
        System.out.println("The price calculated is: " + priceCalculated);
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
