package behavioral.strategy;

public class Student {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean pay(double d) {
        return paymentStrategy.pay(d);
    }
}
