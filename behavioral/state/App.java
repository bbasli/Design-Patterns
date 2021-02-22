package behavioral.state;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

        System.out.println();
        car.goBack();
        car.goBack();
        System.out.println();

        car.goForward();
        System.out.println(car);
    }
}
