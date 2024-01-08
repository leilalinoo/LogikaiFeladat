package logikaioop;

import java.util.Scanner;

public class Bekeres {

    private static void kiir(String leiras) {
        System.out.println(leiras);
    }

    public static String bekeres() {
        Scanner sc = new Scanner(System.in);
        String valasz;
        kiir("Melyik: ");
        valasz = sc.nextLine();
        return valasz;
    }

    public static void run() {

        Lada a1 = new Lada("Alma", "arany", true);
        kiir("Leírás");
        kiir("" + a1.toString());
        Lada a2 = new Lada("szőlő", "fa", false);
        kiir("" + a2.toString());
        Lada a3 = new Lada("szilva", "gyémánt", true);
        kiir("" + a3.toString());
        bekeres();
        kiir("A válasz jó | rossz");
    }
}
