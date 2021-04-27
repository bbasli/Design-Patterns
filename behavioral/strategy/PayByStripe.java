package behavioral.strategy;

public class PayByStripe extends PaymentStrategy {
    @Override
    public boolean pay(double payment) {
        System.out.println("Paid $" + payment * 0.95 + " for by STRIPE this semester.");
        return true;
    }
}
