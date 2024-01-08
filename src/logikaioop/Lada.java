package logikaioop;

public class Lada {
    private String anyag;
    private boolean kincs;
    private String allitas;

    public Lada(String anyag, boolean kincs, String allitas) {
        this.anyag = anyag;
        this.kincs = kincs;
        this.allitas = allitas;
    }
    
    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }
    
    public String getAnyag() {
        return anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public String getAllitas() {
        return allitas;
    }

    @Override
    public String toString() {
        return "Lada {" + " anyag = " + anyag + ", kincs = " + kincs + ", allitas = " + allitas + '}';
    }


    
}
