package structural.bridge.platform;

import structural.bridge.Film;

public class AmazonPrime extends Platform {
    @Override
    public String play(Film film) {
        System.out.println(film + " is playing on AmazonPrime");
        return film.getName();
    }
}
