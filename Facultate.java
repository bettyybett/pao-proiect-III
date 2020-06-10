package proiect;
import java.util.List;
public class Facultate {
    private String nume_facultate;
    private List <Departament> departamente;

    public Facultate(){}
    public Facultate(String nume_facultate, List <Departament> departamente)
    {
        this.nume_facultate=nume_facultate;
        this.departamente=departamente;
    }


    public String getNume_facultate() {
        return nume_facultate;
    }

    public void setNume_facultate(String nume_facultate) {
        this.nume_facultate = nume_facultate;
    }


    public List<Departament> getDepartamente() {
        return departamente;
    }

    public String afis_facultate() {
        return "\nNume facultate: " + nume_facultate + ", Judet: "  + ", Departamente: " + departamente ;
    }
}
