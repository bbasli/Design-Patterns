package behavioral.observer;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer o1 = new ObserverA();
        Observer o2 = new ObserverB();

        subject.attach(o1);
        subject.attach(o2);

        System.out.println("*********");

        subject.changeState();

        System.out.println("*********");

        subject.detach(o1);

        subject.changeState();
    }
}


