package proiect;


public class Adresa{

    private String oras,tara,strada;
    private int numar;

    public Adresa(){}
    public Adresa(String oras, int numar, String strada, String tara) {
        this.oras = oras;
        this.numar = numar;
        this.strada = strada;
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }


    public String afis_adresa()
    {
        return "\nTara: " + tara + ", Oras: " + oras + ", Stada: " +strada+ ", Numar: "+ numar;


    }

}
