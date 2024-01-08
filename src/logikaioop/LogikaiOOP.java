package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {

        String valasz;
        Allitas a1 = new Allitas("1 alma van");
        kiir("Leírás");
        kiir("" + a1.toString());
        Allitas a2 = new Allitas("2 alma van");
        kiir("" + a2.toString());
        Allitas a3 = new Allitas("3 alma van");
        kiir("" + a3.toString());

        kiir("Melyik: ");

        kiir("A válasz jó | rossz");
    }

    private static void kiir(String leiras) {
        System.out.println(leiras);
    }

}
