package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {

        String valasz;
        Lada a1 = new Lada("Alma", "arany", true);
        kiir("Leírás");
        kiir("" + a1.toString());
        Lada a2 = new Lada("szőlő", "fa", false);
        kiir("" + a2.toString());
        Lada a3 = new Lada("szilva", "gyémánt", true);
        kiir("" + a3.toString());

        kiir("Melyik: ");

        kiir("A válasz jó | rossz");
    }

    private static void kiir(String leiras) {
        System.out.println(leiras);
    }

}
