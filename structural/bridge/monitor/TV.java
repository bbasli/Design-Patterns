package structural.bridge.monitor;

public class TV extends Monitor {

    @Override
    public void display(String film) {
        System.out.println("Film is displaying on TV.");
    }
}
