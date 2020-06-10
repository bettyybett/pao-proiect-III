package proiect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Elev {
    private String nationalitate,liceu,cnp;
    double nota;
    Nume nume=new Nume();
    Adresa adresa=new Adresa();
    Note note= new Note();
    public Elev(){}
    public Elev(String[]  participanti)
    {
        this.liceu=participanti[7];
        this.cnp=participanti[8];
    }
    public Elev(String liceu, String cnp, Nume nume, Adresa adresa, Note note)
    {

        this.liceu=liceu;
        this.cnp=cnp;
        this.nume=nume;
        this.adresa=adresa;
        this.note=note;
    }

    public String getLiceu() {

        BufferedWriter abw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"get liceu: "+new Date());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (abw != null)
                    abw.close();

                if (afw != null)
                    afw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }
        return liceu;
    }

    public String getCnp() {

        BufferedWriter abw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"get cnp: "+new Date());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (abw != null)
                    abw.close();

                if (afw != null)
                    afw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }
        return cnp;
    }


    public void setLiceu(String liceu) {
        this.liceu = liceu;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public String afis()
    {
        return nume.afis_nume()+ "\nCnp: " +  cnp + ", Liceul de provenienta: " + liceu + note.afis_note();
    }

}
