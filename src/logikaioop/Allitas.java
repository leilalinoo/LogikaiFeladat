
package logikaioop;

public class Allitas {
    String allitas;
    String valasz;
    static int sorszam;

    public String getAllitas() {
        return allitas;
    }

    public static int getSorszam() {
        return sorszam;
    }

    public Allitas(String allitas) {
        this.allitas = allitas;
        this.valasz = "2";
        sorszam++;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public String getValasz() {
        return valasz;
    }

    @Override
    public String toString() {
        return "Allitas{" + "allitas=" + allitas + '}';
    }

    

   
}
