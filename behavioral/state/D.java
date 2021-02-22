package behavioral.state;

public class D extends State {

    @Override
    public void goBack() {
        System.out.println("The car will stop and go back.");
    }

    @Override
    public void goForward() {
        System.out.println("The car is still moving forward.");
    }

    @Override
    public String toString() {
        return "D";
    }
}
