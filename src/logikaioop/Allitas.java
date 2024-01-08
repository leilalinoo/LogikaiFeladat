package logikaioop;

public class Allitas {

    private String allitas;
    private static int sorszam = 0;
    
    public Allitas(String allitas) {
        sorszam ++;
        this.allitas = allitas;
    }
    
    public String allitas(){
        return "A(z) "+getSorszam()+". állítás!";
    }

    public String getAllitas() {
        return allitas;
    }

    public static int getSorszam() {
        return sorszam;
    }
    
    
    
}
