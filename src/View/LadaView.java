package View;

import java.util.Scanner;

public class LadaView {
    
     public static void kiir(String leiras) {
        System.out.println(leiras);
    }

    public static String bekeres() {
        Scanner sc = new Scanner(System.in);
        String valasz;
        kiir("Minden láda egy-egy állítást tartalmaz, de csak egy mond igazat."
                + "\n A kincs valós helyzete: {A, E, B}");
        valasz = sc.nextLine();
        return valasz;
    }
    
        public static void run() {
        kiir("Leírás");
        String valasz = bekeres();
    }
    
    
}
