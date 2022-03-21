package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

    static String[] szavak = {"fa", "ág", "tő"};
    Random rnd = new Random();
    Scanner bead = new Scanner(System.in);
    private static void valaszt() {

    }

    private static void beker() {
        System.out.print("Kérem adjon meg 2 betűt: ");
    }

    private static void kiirat() {
        
    }

    public static void main(String[] args) {
        valaszt();
        beker();
        kiirat();
    }

}
