package behavioral.chainofResponsibility;

public class Chain {
    Controller chain;

    public Chain() {
        chain = new EvenController(new OddController(null));
    }

    public void control(int n) {
        chain.control(n);
    }
}
