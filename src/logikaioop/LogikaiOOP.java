package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {


        String valasz;
        Lada a1 = new Lada("réz", true, "orosz csataló");
        kiir("Leírás");
        kiir("" + a1.toString());
        Lada a2 = new Lada("bőr", false, "orosz csataló");
        kiir("" + a2.toString());
        Lada a3 = new Lada("autó", true, "orosz csataló");
        kiir("" + a3.toString());

        kiir("Melyik: ");

        kiir("A válasz jó | rossz");
    }

    private static void kiir(String leiras) {
        System.out.println(leiras);
    }
}
