package lekcja11;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1. Używanie klas wbudowanych
//        Przejdziemy przez pakiet Time
        LocalTime localTime = LocalTime.of(1,1,1);
        System.out.println(localTime);

        LocalTime localTimePlusTwo = localTime.plusHours(2);
        System.out.println(localTimePlusTwo);

//        2. Spróbuj stworzyć datę swoich urodzin eksplorując pakiet Time
//        https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

//        3. Dostęp do wartości elementów
//        LocalDate date = LocalDate.now();
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getMonth());
//        System.out.println(date.getYear());

//        4. NazwaKlasy - schemat klasy
//        5. Obywatel - przykładowa klasa
//        Obywatel nika = new Obywatel("Nika", 1988, 12, 12, 0);
////        System.out.println(nika.getDateOfBirth());
//
//        Obywatel tosia = new Obywatel("Tosia", 2016, 5, 27, 200);
//        Obywatel marysia = new Obywatel("Marysia", 2018, 10, 5, 200);
//
//        List<Obywatel> rodzinka = new ArrayList<>();
//        rodzinka.add(nika);
//        rodzinka.add(tosia);
//        rodzinka.add(marysia);
//
////        Pokazujemy wszystkim ile maja kieszonkowego
//        for (Obywatel czlonekRodziny : rodzinka) {
//            czlonekRodziny.showPocketMoney();
//        }
//
////        Podnosimy wszystkim kieszonkowe o 5%
//        for (Obywatel czlonekRodziny : rodzinka) {
//            czlonekRodziny.increasePocketMoney(5);
//        }
//
////        Pokazujemy wszystkim ile maja kieszonkowego
//        for (Obywatel czlonekRodziny : rodzinka) {
//            czlonekRodziny.showPocketMoney();
//        }

//        6. Przerobić powyższe na metody (+ wrzucić je do klasy), raisePocketMoney (co gdyby nie %  a kwota?)
//        7. Omówienie Obywatela
//        marysia.Obywatel();

    }
}
