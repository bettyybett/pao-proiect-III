package proiect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Nume {
    private String nume,prenume,init_tata;
    private int id;
    public Nume(){}
    public Nume(String[] participanti)
    {
        this.nume=participanti[0];
        this.prenume=participanti[2];
        this.init_tata=participanti[1];
    }
    public Nume(String nume,String init_tata,String prenume)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.init_tata=init_tata;
        //cast string to double
    }

    public String getNume() {

        BufferedWriter abw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"get nume: "+new Date());
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
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        BufferedWriter abw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"get prenume: "+new Date());
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
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getInit_tata()
    {BufferedWriter abw = null;
    FileWriter afw = null;

        try {
        afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
        abw = new BufferedWriter(afw);
        abw.write("\n"+"get inititiala tataului: "+new Date());
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
        return init_tata;
    }

    public void setInit_tata(String init_tata) {
        this.init_tata = init_tata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String afis_nume()
    {
        return "\nNume: " + nume + ", Inititiala tatalui: " + init_tata + ", Prenume: " + prenume;
    }

}
