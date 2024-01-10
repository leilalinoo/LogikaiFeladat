package logikaioop;

import java.util.Scanner;

public class Bekeres {

    private static void kiir(String leiras) {
        System.out.println(leiras);
    }

    public static String bekeres() {
        Scanner sc = new Scanner(System.in);
        String valasz;
        kiir("A helyes válasz: {A, E, B}");
        valasz = sc.nextLine();
        return valasz;
    }

    public static void run() {

        Lada a1 = new Lada("én rejtem a kincset!!", "Arany láda", false);
        kiir("Leírás");
        kiir("" + a1.megjelen());
        Lada a2 = new Lada("nem én rejtem a kincset...", "Ezüst láda", true);
        kiir("" + a2.megjelen());
        Lada a3 = new Lada("az arany hazudik!!!", "Bronz láda", false);
        kiir("" + a3.megjelen());
        String valasz = bekeres();
        String v1 = "Megtaláltad a kincset!!";
        if (!a2.eredmeny(valasz)) {
            v1 = "Vesztettél, a bronz láda igazat szólt :(";
        }
        kiir(v1);
    }
}
