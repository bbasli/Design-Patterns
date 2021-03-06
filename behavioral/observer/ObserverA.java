package behavioral.observer;

public class ObserverA extends Observer{
    @Override
    public void update(Subject s) {
        if (s.state > 50)
            System.out.println("ObserverA is doing something");
    }
}
