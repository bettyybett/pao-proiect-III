package proiect;

import java.io.*;
import java.sql.*;
import java.util.*;


public class Service {

   private static Service single_instance=null;
   public static Service getInstance() {
       if (single_instance == null) {

           single_instance = new Service();
       }
       return single_instance;
   }
    Jdbc jdbc = new Jdbc();
    public void jdbc_function() {


        String url = "jdbc:mysql://localhost:3306/proiect";
        String username = "root";
        String password = "";


        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            //String query = "INSERT INTO proiect.nume values('1','Diac','M','Clau')";
            //String selectQuery = "SELECT * FROM proiect.nume";
            //statement.executeUpdate(query);

            //jdbc.createStudent(statement,"proiect.student"," values('2','Bordianu','I.','Ada','8.65','9.10','07456','ada@gmail.com','CN T.Vianu','2990922') ");
            //jdbc.updateStudent(statement,(float) 10, 2);
           // jdbc.deleteStudent(statement,2,"proiect.student");
            ResultSet resultSet = jdbc.readStudent(statement," proiect.student");
            while(resultSet.next()) {


                Student st = new Student();
                st.setId(resultSet.getInt("id"));
                st.elev.nume.setNume(resultSet.getString("nume"));
                st.elev.nume.setInit_tata(resultSet.getString("init_tata"));
                st.elev.nume.setPrenume(resultSet.getString("prenume"));
                st.elev.note.setMedie_liceu(resultSet.getFloat("medie_liceu"));
                st.elev.note.setNota_bac(resultSet.getFloat("medie_bac"));
                st.setTelefon(resultSet.getString("telefon"));
                st.setMail(resultSet.getString("email"));
                st.elev.setLiceu(resultSet.getString("liceu"));
                st.elev.setCnp(resultSet.getString("cnp"));

                System.out.println(st.afis_student());
            }


        } catch (SQLException e) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            e.printStackTrace();
        }
    }

    public void functie() {
        String line = "";
        String csv_split = ",";
        BufferedWriter abw = null;
        FileWriter afw = null;
        //CSV csv=new CSV();
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Vrei sa adaugi un student nou?");
        /*String rasp=scan.next();
        if (rasp.equals("da")||rasp.equals("Da")||rasp.equals("DA")||rasp.equals("dA"))
            csv.add_student();*/


        Departament dep1=new Departament("Matematica",5);
        Departament dep2=new Departament("Informatica",5);
        Departament dep3=new Departament("CTI",3);

        ArrayList<Student> bla= new ArrayList<Student>();
        ArrayList<Student> blaa= new ArrayList<Student>();
        ArrayList<Student> blaaa= new ArrayList<Student>();

        List <Student> Students =new ArrayList<>();

        List<Departament> Departaments =new ArrayList<>();

        Departaments.add(dep1);
        Departaments.add(dep2);
        Departaments.add(dep3);
        /*try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"adaugare departamente: "+new Date());
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
        }*/

        Facultate facultate= new Facultate("fmi", Departaments);
        //double x=note.setNota_admitere(8.75,8.30);

        Note note=new Note(8.75,8.30);
        Nume nume=new Nume("Diaconu","M.","Beatrice");
        Adresa adresa=new Adresa("Bucuresti",86,"Alx I Cuza","Romania");
        Elev elev1=new Elev("CN Ion Neculce","123456789",nume,adresa,note);
        Student student1 = new Student("0745326026","bettyesuper@yahoo.com", elev1,dep1);

        Note note1=new Note(8.15,9.30);
        Nume nume1=new Nume("Vasile","D","Alexandru");
        Adresa adresa1=new Adresa("Bucuresti",2,"Miron Costin","Romania");
        Elev elev2=new Elev("CN Ion Neculce","987654321",nume1,adresa1,note1);
        Student student2=new Student("0759492586","vs.alex@gmail",elev2,dep1);

        Note note2=new Note(9.15,9.30);
        Nume nume2=new Nume("Gulinescu","L","Crina Daria");
        Adresa adresa2=new Adresa("Bucuresti",78,"Liviu Rebreanu","Romania");
        Elev elev3=new Elev("CN Gheorghe Sincai","456565846",nume2,adresa2,note2);
        Student student3=new Student("04868745","guli.daria@yahoo.com",elev3,dep1);

        Note note3=new Note(7.06,8.68);
        Nume nume3=new Nume("Agache","D","Valentin");
        Adresa adresa3=new Adresa("Ilfov",78,"Aparatorii Patriei","Romania");
        Elev elev4=new Elev("CN Emil Racovita","130455876",nume3,adresa3,note3);
        Student student4=new Student("0754486556","agh.vali@yahoo.com",elev4,dep1);
        Students.add(student1);
        Students.add(student2);
        Students.add(student3);
        Students.add(student4);
        /*try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n"+"adaugare studenti: "+new Date());
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
        }*/
        for( Student st : Students){
            if(st.departament.getDenumire().equals("Matematica"))
                bla.add(st);
            if (st.departament.getDenumire().equals("Informatica"))
                blaa.add(st);
            else
            if(st.departament.getDenumire().equals("CTI"))
                blaaa.add(st);
        }


        Collections.sort(bla, new cmp_nume());
    /*
        System.out.println("Studentii de la departamentul de Matematica:");
        for(Student st :bla) {
                System.out.println(st.elev.nume.getNume()+" " +st.elev.nume.getPrenume());
            }
        System.out.println("Studentii de la departamentul de Informatica:");
        for(Student st :blaa) {
                System.out.println(st.elev.nume.getNume()+" "+ st.elev.nume.getPrenume());
            }
        System.out.println("Studentii de la departamentul de CTI:");
        for(Student st :blaaa) {
                System.out.println(st.elev.nume.getNume()+" " +st.elev.nume.getPrenume());
            }

        for(Student bleah : Students) {
            System.out.println(bleah.afis_student());}*/
        /*try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\out.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n-------------------------------");
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
*/
    }
}

