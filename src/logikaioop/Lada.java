package logikaioop;

public class Lada {

    private String allitas, anyag, valasz;
    private boolean kincs;

    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
        this.anyag = anyag;
        this.kincs = kincs;
        this.valasz = "E";
    }

    public boolean eredmeny(String masik) {
        return this.valasz.equals(masik);
    }

    public String getAllitas() {
        return allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;

    }

    public String megjelen(){
       String ki = anyag+": \""+allitas+"\"" ;
       return ki;
    }

}
