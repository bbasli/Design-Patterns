package behavioral.strategy;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        double payment = 10000;

        PaymentStrategy paymentStrategy = new PayByStripe();

        student.setPaymentStrategy(paymentStrategy);
        student.pay(payment / 2);

        System.out.println();

        paymentStrategy = new PayByCreditCard();
        student.setPaymentStrategy(paymentStrategy);
        student.pay(payment / 2);
    }
}
