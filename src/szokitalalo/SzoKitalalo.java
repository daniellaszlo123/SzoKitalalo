package szokitalalo;

import java.util.Random;

public class SzoKitalalo {

    static String[] szavak = {"fa", "ág", "tó"};
    static Random rnd = new Random();

    private static String valaszt() {
        int egySzo = rnd.nextInt(3);
    return szavak[egySzo];
    }

    private static void beker() {
        
    }

    private static void kiirat() {
        
    }

    public static void main(String[] args) {
        String kitalalando=valaszt();
        beker();
        kiirat();
    }

}
