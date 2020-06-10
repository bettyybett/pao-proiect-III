package proiect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Note {
    private double nota_bac,medie_liceu,nota_admitere;
    public BufferedWriter abw = null;
    public FileWriter afw = null;
    public Note(){}
    public Note(String[] participanti)
    {
        this.nota_bac=Double.parseDouble(participanti[3]);
        this.medie_liceu=Double.parseDouble(participanti[4]);
    }
    public Note(double nota_bac, double medie_liceu)
    {
        this.nota_bac=nota_bac;
        this.medie_liceu=medie_liceu;
        nota_admitere=(nota_bac+medie_liceu)/2;
    }

    public double getNota_bac() {
        BufferedWriter abw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"get nota bac: "+new Date());
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
        return nota_bac;
    }

    public void setNota_bac(double nota_bac) {
        this.nota_bac = nota_bac;
    }

    public double getMedie_liceu() {
        BufferedWriter abw = null;
        FileWriter afw = null;

        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"get medie liceu: "+new Date());
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
        return medie_liceu;
    }

    public void setMedie_liceu(double medie_liceu) {
        this.medie_liceu = medie_liceu;
    }


    public double setNota_admitere(double note_bac, double medie_liceu) {
        nota_admitere = (note_bac + medie_liceu) / 2;
        return nota_admitere;
    }
    public double getNota_admitere()
    {
        return nota_admitere;
    }


    public String afis_note()
    {
        return "\nNota admitere: " + (medie_liceu+nota_bac)/2;//setNota_admitere(nota_bac,nota_admitere);
    }

}
