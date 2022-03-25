package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

    static String[] szavak = { "fa", "ág", "tó" };
    static Random rnd = new Random();
    static Scanner scanner = new Scanner(System.in);

    private static String valaszt() {
        int egySzo = rnd.nextInt(3);
        //System.out.println(egySzo);
        return szavak[egySzo];
    }

    private static String beker() {
        String szoBe;
        System.out.print("Kérem adjon meg egy két betű szót: ");
        szoBe = scanner.nextLine();
        System.out.println("");
//        System.out.print(szoBe);
        if (szoBe.length() != 2) {
            while (!(szoBe.length() == 2)) {
                System.out.println("Nem két betűs szót adott meg! Újra: ");
                szoBe = scanner.nextLine();
            }
        }

        return szoBe;
    }

    private static void dontes() {
        // char[] szavunk = new char[valaszt().length()];
        // char[] tipp = new char[beker().length()];
        String szavunk = valaszt();
        while (true) {

            String tipp = beker();
            char elsoT = tipp.charAt(0);
            char masodikT = tipp.charAt(1);
            char elsoSz = szavunk.charAt(0);
            char masodikSz = szavunk.charAt(1);
            if (elsoT == elsoSz && masodikT == masodikSz) {
                System.out.println("Kitaláltad a szót! Gratulálok!");
                break;
            } else if (elsoT == elsoSz || elsoT == masodikSz) {
                System.out.println("'" + elsoT + "'" + " betű benne van.");
            } else if (masodikT == elsoSz || masodikT == masodikSz) {
                System.out.println("'" + masodikT + "'" + " betű benne van.");
            } else {
                System.out.println("Egyik betű sem szerepel a szóban.");
            }
        }

    }

    private static void newGame() {
        System.out.println("Szeretnél játstszani még egy kört? (I/N)");
        String awn = scanner.nextLine();
        while (!(awn.equals("I") || awn.equals("N"))) {
            System.out.println("Szeretnél játstszani még egy kört? (I/N)");
            awn = scanner.nextLine();
        }
        if (awn.equals("I")) {
            dontes();
        } else {
            System.out.println("Köszönjük hogy játszottál");
        }
    }

    public static void main(String[] args) {
        // String kitalalando = valaszt();
        dontes();
        newGame();
    }

}
