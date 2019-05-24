package strategyExcercisePricing.pricing_strategy;

import strategyExcercisePricing.pricing_strategy.PricingStrategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public int calculatePrice(int price, boolean isSignedToNewsletter) {
        if (isSignedToNewsletter == false)
            return price;
        else {
            throw new UnsupportedOperationException("The client is signed to the newsletter- choose different pricing strategy");
        }
    }
}
