package behavioral.chainofResponsibility;

public abstract class Controller {
    private Controller controller;

    public Controller(Controller c) {
        this.controller = c;
    }

    public void control(int number) {
        controller.control(number);
    }
}
