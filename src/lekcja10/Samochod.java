package lekcja10;

import lekcja10.silnik.SilnikZaplonowy;
import lekcja10.stacyjka.Stacyjka;

public class Samochod {
    // składowe obiektu, inaczej pola klasy
    SilnikZaplonowy silnikZaplonowy;
    Stacyjka stacyjka;

    public Samochod() {
        this.silnikZaplonowy = new SilnikZaplonowy();
        this.stacyjka = new Stacyjka();
    }

    // metoda
    public void odpal() throws InterruptedException {
        if (!stacyjka.isPrzekrecona()) {
            stacyjka.przekrec();
        }
        silnikZaplonowy.odpalSilnikGlowny(stacyjka);
    }
}
