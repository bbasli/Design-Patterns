package structural.bridge.platform;

import structural.bridge.Film;

public class Netflix extends Platform {

    public String play(Film film) {
        System.out.println(film + " is playing on Netflix");

        return film.getName();
    }
}
