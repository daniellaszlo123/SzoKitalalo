package szokitalalo;

import java.util.Random;
import java.util.Scanner;

public class SzoKitalalo {

    static String[] szavak = {"fa", "ag", "to"};//{"fa", "ág", "tó"}; ékezetekkel hibás
    static Random rnd = new Random();
    static Scanner scanner = new Scanner(System.in);

    private static String valaszt() {
        int egySzo = rnd.nextInt(3);
    return szavak[egySzo];
    }

    private static String beker() {
        String szoBe;
        System.out.print("Kérem adjon meg egy két betű szót: ");
        szoBe = scanner.nextLine();
        System.out.println("");
//        System.out.print(szoBe);
        if(szoBe.length()>2 || szoBe.length()<2){
            while (!(szoBe.length()==2)){
                System.out.println("Nem két betűs szót adott meg!Újra: ");
                szoBe = scanner.nextLine();
            }
        }
        
        return szoBe;
    }
    
    private static void dontes(){
//        char[] szavunk = new char[valaszt().length()];
//        char[] tipp = new char[beker().length()];
        String szavunk = valaszt();
        System.out.println(szavunk);
        String tipp = beker();
        char elsoT=tipp.charAt(0);
        char masodikT=tipp.charAt(1);
        char elsoSz=szavunk.charAt(0);
        char masodikSz=szavunk.charAt(1);
        String ki="";
        
        while (!(elsoT == elsoSz && masodikT == masodikSz)) {
            if(elsoT==elsoSz){
                ki=String.format("'%c' betű benne van, és jó helyen.", elsoT);
            }else if (elsoT==masodikSz){
                ki=String.format("'%c' betű benne van, de NEM jó helyen.", elsoT);
            }else{
                ki="Nincs benne az első karakter.";
            }
            System.out.println(ki);
            if(masodikT==elsoSz){
                ki=String.format("'%c' betű benne van, de NEM jó helyen.", masodikT);
            }else if (masodikT==masodikSz){
                ki=String.format("'%c' betű benne van, és jó helyen.", masodikT);
            }else{
                ki="Nincs benne a második karakter.";
            }
            System.out.println(ki+"\n");
            tipp = beker();
            elsoT=tipp.charAt(0);
            masodikT=tipp.charAt(1);
        }
        System.out.println("Gratulálok, sikeresen kitaláltad a szót.");

    }

    private static void kiirat() {
        
    }

    public static void main(String[] args) {
        String kitalalando=valaszt();
        dontes();
        kiirat();
    }

}
