package Controller;

import logikaioop.Lada;

public class Controller {

    public static void main(String[] args) {
        Lada a1 = new Lada("én rejtem a kincset!!", "Arany láda", false);
        Lada a2 = new Lada("nem én rejtem a kincset...", "Ezüst láda", true);
        Lada a3 = new Lada("az arany hazudik!!!", "Bronz láda", false);
//        vizsgalat(a2);
    }
    
    
//    public static void vizsgalat(Lada a2){
////    String valasz = bekeres();
//        String v1 = "Megtaláltad a kincset!!";
//        if (!a2.eredmeny(valasz)) {
//            v1 = "Vesztettél, az ezüst ládában van a kincs :(";
//
//        }
//    }
}
