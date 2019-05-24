package strategyExcercisePricing.pricing_strategy;

import strategyExcercisePricing.pricing_strategy.PricingStrategy;

public class SalePrice implements PricingStrategy {
    @Override
    public int calculatePrice(int price, boolean isSignedToNewsletter) {
        if (isSignedToNewsletter == true)
            return price / 2;
        else {
            throw new UnsupportedOperationException("The client is signed to the newsletter- choose different pricing strategy");
        }
    }
}
