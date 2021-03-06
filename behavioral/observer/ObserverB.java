package behavioral.observer;

public class ObserverB extends Observer {
    @Override
    public void update(Subject s) {
        if (s.state < 74)
            System.out.println("ObserverB is doing something");
    }
}
