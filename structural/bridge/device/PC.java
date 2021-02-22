package structural.bridge.device;

import structural.bridge.Film;
import structural.bridge.monitor.Monitor;
import structural.bridge.platform.Platform;

public class PC extends AbstractPC {

    public PC(Monitor m, Platform p) {
        super(m, p);
    }

    public void play(Film film) {
        super.play(film);
    }
}
