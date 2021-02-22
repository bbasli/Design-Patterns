package behavioral.chainofResponsibility;

public class App {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.control(3);
        chain.control(6);
        chain.control(-24);
        chain.control(15);
    }
}
