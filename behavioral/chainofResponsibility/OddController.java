package behavioral.chainofResponsibility;

public class OddController extends Controller {

    public OddController(Controller c) {
        super(c);
    }

    public void control(int n) {
        if (n % 2 != 0)
            System.out.println("Odd Controller detected odd number: " + n);
        else
            super.control(n);
    }
}
