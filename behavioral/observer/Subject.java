package behavioral.observer;

import java.util.LinkedList;
import java.util.Random;

public class Subject {
    public int state;
    private LinkedList<Observer> observers;

    public Subject() {
        state = 0;
        observers = new LinkedList<>();
    }

    public void attach(Observer o){
        System.out.println("Subject: Attached an observer.");
        observers.add(o);
    }

    public void detach(Observer o){
        System.out.println("Subject: Detached an observer.");
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o : observers)
            o.update(this);
    }

    public void changeState(){
        Random random = new Random();
        state = random.nextInt(100);

        System.out.println("State is changed!!!");
        System.out.println("New State: " + state);
        notifyObservers();
    }
}
