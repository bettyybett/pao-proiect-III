package proiect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

public class CSV {


    public CSV()
    {
        String csv_file = "C:\\Users\\Betty\\Desktop\\facultate.csv";
        BufferedReader br = null;
        String line = "";
        String csv_split = ",";
        try {

            br = new BufferedReader(new FileReader(csv_file));
            while ((line = br.readLine()) != null) {

                String[] participanti = line.split(csv_split);
                Nume  nume=new Nume(participanti);
                Elev elev=new Elev(participanti);
                Student st=new Student(participanti);
                Note note=new Note(participanti);
                System.out.println(nume.getNume()+" " +nume.getInit_tata()+" "+nume.getPrenume()+" "+note.getNota_bac() +" " +note.getMedie_liceu()+" "+st.getMail()+" "+st.getTelefon()+" " +elev.getLiceu()+" " +elev.getCnp()+" "+note.setNota_admitere(note.getNota_bac(),note.getMedie_liceu()));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*public void remove_student(int rmv_linie)
    {
        String csv_file = "C:\\Users\\Betty\\Desktop\\facultate.csv";
        BufferedReader br = null;
        String line = "";
        String csv_split = ",";
        try {
            int cnt_linie=0;
            String[] csvLastRecord=null;
            br = new BufferedReader(new FileReader(csv_file));
            while ((line = br.readLine()) != null) {

                String[] linii = line.split(csv_split);
                cnt_linie++;
            }
            while(cnt_linie!=0)
            {
                if(rmv_linie==cnt_linie)
                {

                        csvLastRecord = cnt_linie.next();
                        cnt_linie.remove();

                }
                cnt_linie--;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
    public void add_student() {
        String csv_file = "C:\\Users\\Betty\\Desktop\\facultate.csv";
        String audit="C:\\Users\\Betty\\Desktop\\out.csv";
        BufferedReader br = null;
        String line = "";
        String csv_split = ",";
        BufferedWriter bw = null;
        BufferedWriter abw = null;
        FileWriter fw = null;
        FileWriter afw = null;
        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"adaugare nou student: "+new Date());
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


        try {

            Scanner scan = new Scanner(System.in);

            fw = new FileWriter("C:\\Users\\Betty\\Desktop\\facultate.csv",true);
            bw = new BufferedWriter(fw);
            String nume = scan.nextLine();
            String init_tata=scan.nextLine();
            String prenume=scan.nextLine();
            String nota_bac=scan.nextLine();
            double d_nota_bac=Double.parseDouble(nota_bac);
            String medie_liceu=scan.nextLine();
            double d_medie_liceu=Double.parseDouble(medie_liceu);
            String telefon=scan.nextLine();
            String email=scan.nextLine();
            String liceu=scan.nextLine();
            String cnp=scan.nextLine();

            StringBuilder student = new StringBuilder();

            student.append('\n');
            student.append(nume+",");
            student.append(init_tata+',');
            student.append(prenume+',');
            student.append(nota_bac+',');
            student.append(medie_liceu+',');
            student.append(telefon+',');
            student.append(email+",");
            student.append(liceu+",");
            student.append(cnp);

           // abw.write("AddStudent: "+ new Date());
            bw.write(student.toString());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }

    }



}
