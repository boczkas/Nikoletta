package lekcja5;

public class Main {
    public static void main(String[] args) {
        //    1. Instrukcje przerywające przepływ sterowania
//    break;
//    continue;

        int i = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("==============");

        i = 0;

        while (i < 10) {
            i++;
            if (i > 5) {
                break;
            }
            System.out.println("i = " + i);
        }


    }
}
