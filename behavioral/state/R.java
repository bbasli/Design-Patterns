package behavioral.state;

public class R extends State {

    @Override
    public void goForward() {
        System.out.println("The car will stop and go forward.");
    }

    @Override
    public void goBack() {
        System.out.println("the car is still going back");
    }

    @Override
    public String toString() {
        return "R";
    }
}
