package behavioral.state;

public abstract class State {
    public abstract void goForward();

    public abstract void goBack();

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
