package behavioral.chainofResponsibility;

public class EvenController extends Controller {
    public EvenController(Controller c) {
        super(c);
    }

    public void control(int n) {
        if (n % 2 == 0)
            System.out.println("Even Controller detected even number: " + n);
        else
            super.control(n);
    }
}
