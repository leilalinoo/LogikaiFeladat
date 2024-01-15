package Controller;

import View.LadaGUI;
import View.LadaView;
import logikaioop.Lada;

public class Controller {

    public static void run() {
        LadaView v1 = new LadaView();
//        LadaGUI v2 = new LadaGUI(); 
        Lada a1 = new Lada("én rejtem a kincset!!", "Arany láda", false);
        v1.kiir("" + a1.megjelen());
        Lada a2 = new Lada("nem én rejtem a kincset...", "Ezüst láda", true);
        v1.kiir("" + a2.megjelen());
        Lada a3 = new Lada("az arany hazudik!!!", "Bronz láda", false);
        v1.kiir("" + a3.megjelen());
        String valasz = v1.bekeres();

        vizsgalat(a2, valasz);

    }

    public static void vizsgalat(Lada a2, String valasz) {

        String vl = "Megtaláltad a kincset!!";
        if (!a2.eredmeny(valasz)) {
            vl = "Vesztettél, az ezüst ládában van a kincs :(";

        }
        System.out.println(vl);
    }
}
