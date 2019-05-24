package strategyExcercisePricing.pricing_strategy;

public interface PricingStrategy {
    public int calculatePrice(int price, boolean isSignedToNewsletter);
}
