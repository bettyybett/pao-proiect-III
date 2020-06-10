package proiect;
public class Departament {

    private int nr_locuri,nr_locuri_buget,nr_locuri_bursa;
    private String denumire;

    public Departament(){}

    public Departament(String denumire, int nr_locuri) {
        this.nr_locuri = nr_locuri;
        this.denumire = denumire;
    }

    public int getNr_locuri() {
        return nr_locuri;
    }

    public void setNr_locuri(int nr_locuri) {
        this.nr_locuri = nr_locuri;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String toString() {
        return "\nDepartament: "+ denumire ;
    }
}
