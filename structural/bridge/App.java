package structural.bridge;

import structural.bridge.Film;
import structural.bridge.device.PC;
import structural.bridge.monitor.PCMonitor;
import structural.bridge.monitor.TV;
import structural.bridge.platform.AmazonPrime;
import structural.bridge.platform.Netflix;

public class App {
    public static void main(String[] args) {
        Film film = new Film("Titanic");

        PC pc = new PC(new TV(), new AmazonPrime());
        pc.play(film);

        System.out.println("********************");
        System.out.println("********************");

        PC pc2 = new PC(new PCMonitor(), new Netflix());
        pc2.play(film);
    }
}
