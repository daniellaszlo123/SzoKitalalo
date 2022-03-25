package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

    static String[] szavak = { "fa", "ág", "tó" };
    static Random rnd = new Random();
    static Scanner scanner = new Scanner(System.in, "ISO-8859-1");
    static int szamlalo=0;

    private static String valaszt() {
        int egySzo = rnd.nextInt(3);
        return szavak[egySzo];
    }

    private static String beker() {
        String szoBe;
        System.out.print("Kérem adjon meg egy két betűs szót: ");
        szoBe = scanner.nextLine();
        System.out.println("");
        while (!(szoBe.length() == 2)) {
            System.out.println("Nem két betűs szót adott meg! Újra: ");
            szoBe = scanner.nextLine();
            System.out.println("");
        }

        return szoBe;
    }

    private static void dontes() {
        String szavunk = valaszt();
        String tipp = beker();
        char elsoT = tipp.charAt(0);
        char masodikT = tipp.charAt(1);
        char elsoSz = szavunk.charAt(0);
        char masodikSz = szavunk.charAt(1);
        String ki="";
        while (!(elsoT == elsoSz && masodikT == masodikSz)) {
            boolean elsoElsovel=elsoT==elsoSz, elsoMasodikkal=elsoT==masodikSz, 
                masodikElsovel=masodikT==elsoSz, masodikMasodikkal=masodikT==masodikSz;
            szamlalo++;
            ki=melyikVanJoHelyen(elsoElsovel, elsoMasodikkal, elsoT);
            System.out.println(ki);
            szamlalo++;
            ki=melyikVanJoHelyen(masodikMasodikkal, masodikElsovel, masodikT);
            System.out.println(ki+"\n");
            tipp = beker();
            elsoT=tipp.charAt(0);
            masodikT=tipp.charAt(1);
        }
        System.out.println("Gratulálok, sikeresen kitaláltad a szót.");
    }

    private static void newGame() {
        System.out.println("Szeretnél játstszani még egy kört? (I/N)");
        String awn = scanner.nextLine();
        while (!(awn.equals("N"))) {
            dontes();
            System.out.println("Szeretnél játstszani még egy kört? (I/N)");
            awn = scanner.nextLine();
        }
        
        System.out.println("Köszönjük, hogy játszottál!");
    }

    public static void main(String[] args) {
        dontes();
        newGame();
    }

    private static String melyikVanJoHelyen(boolean joHely, boolean nemJoHely, char karakter) {
        String kimenet="";
        if(joHely){
                kimenet=String.format("'%c' betű benne van, és jó helyen.", karakter);
            }else if (nemJoHely){
                kimenet=String.format("'%c' betű benne van, de NEM jó helyen.", karakter);
            }else{
                kimenet=String.format("Nincs benne a(z) %d. karakter.", szamlalo);
            }
        if (szamlalo==2) {
            szamlalo=0;
        }
        return kimenet;
    }

}
