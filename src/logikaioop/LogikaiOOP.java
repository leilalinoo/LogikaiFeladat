package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        System.out.println("Leírás");
        Allitas all1 = new Allitas("a niki danda");
        System.out.println(all1.allitas() + "   " + all1.getAllitas());

        Allitas all2 = new Allitas("a loki fogyatékos");
        System.out.println(all2.allitas() + "   " + all2.getAllitas());

        Allitas all3 = new Allitas("a loki fs");
        System.out.println(all3.allitas() + "   " + all3.getAllitas());

        System.out.println("Melyik: ");
        System.out.println("A válasz jó | rossz");

    }

}
