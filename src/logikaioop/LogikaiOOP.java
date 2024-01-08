package logikaioop;

import java.util.Scanner;

public class LogikaiOOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valasz;
        kiir("Leírás");
        kiir("Az 1. állítás!");
        kiir("Az 2. állítás!");
        kiir("Az 3. állítás!");
        kiir("Melyik: ");
        valasz = sc.nextLine();
        kiir(valasz);
        kiir("A válasz jó | rossz");
    }

    private static void kiir(String leiras) {
        System.out.println(leiras);
    }

}
