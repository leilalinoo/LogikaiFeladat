
package logikaioop;

public class LogikaiOOP {

    public static void main(String[] args) {
        Allitas a = new Allitas("valami", "valaki", "nyehh");
        
        System.out.println("Leírás");
        System.out.printf("Az 1. állítás! "+a.allitas);
        System.out.printf("\nAz 2. állítás! "+a.allitas2);
        System.out.printf("\nAz 3. állítás! "+a.allitas3);
        System.out.println("Melyik: ");
        System.out.println("A válasz jó | rossz");
    }
    
}
