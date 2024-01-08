package logikaioop;

public class Allitas {
    String allitas,allitas2,allitas3;

    public Allitas(String allitas, String allitas2, String allitas3) {
        this.allitas = allitas;
        this.allitas2 = allitas2;
        this.allitas3 = allitas3;
    }

    public String getAllitas() {
        return allitas;
    }

    public String getAllitas2() {
        return allitas2;
    }

    public String getAllitas3() {
        return allitas3;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public void setAllitas2(String allitas2) {
        this.allitas2 = allitas2;
    }

    public void setAllitas3(String allitas3) {
        this.allitas3 = allitas3;
    }

    @Override
    public String toString() {
        return "Allitas{" + "allitas=" + allitas + ", allitas2=" + allitas2 + ", allitas3=" + allitas3 + '}';
    }
    
}
