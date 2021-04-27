package behavioral.strategy;

public class PayByCreditCard extends PaymentStrategy {
    @Override
    public boolean pay(double payment) {
        System.out.println("Paid $" + payment * 0.99 + " for by CREDIT CARD this semester.");
        return true;
    }
}
