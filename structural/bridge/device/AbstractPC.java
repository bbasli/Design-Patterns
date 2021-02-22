package structural.bridge.device;

import structural.bridge.Film;
import structural.bridge.monitor.Monitor;
import structural.bridge.platform.Platform;

public abstract class AbstractPC {
    protected Monitor monitor;
    protected Platform platform;

    public AbstractPC(Monitor m, Platform p) {
        monitor = m;
        platform = p;
    }

    public void play(Film film) {
        String name = platform.play(film);
        monitor.display(name);
    }
}
