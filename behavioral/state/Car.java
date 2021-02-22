package behavioral.state;

public class Car {
    private State state;

    public Car() {
        this.state = new D();
    }

    public void goForward() {
        state.goForward();
        if (state instanceof R) {
            this.state = new D();
            System.out.println("Gear status of the car: " + state);
        }
    }

    public void goBack() {
        state.goBack();
        if (state instanceof D) {
            this.state = new R();
            System.out.println("Gear status of the car: " + state);
        }
    }

    @Override
    public String toString() {
        return "Car = " + state;
    }
}
