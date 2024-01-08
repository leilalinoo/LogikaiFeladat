package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        Allitas all1 = new Allitas("a niki danda") ;
        Allitas all2 = new Allitas("a loki fogyatékos") ;
        
        System.out.println("Leírás");
        System.out.println(all1.allitas()+"   "+ all1.getAllitas());
        System.out.println(all2.allitas()+"   " + all2.getAllitas());
        System.out.println("Az 3. állítás!");
        System.out.println("Melyik: ");
        System.out.println("A válasz jó | rossz");
    }

}
