package proiect;

//String nume,String init_tata,String prenume,String tara,String nationalitate,String cnp,String liceu
public class Student {
    private String telefon,mail;
    private int id;
    Note note=new Note();
    Departament departament=new Departament();
    Facultate facultate= new Facultate();
    Elev elev=new Elev();
    public Student(){}
    public Student(String[] participanti)
    {
        this.telefon=participanti[5];
        this.mail=participanti[6];
    }
    public Student(String telefon, String mail, Elev elev, Departament departament)
    {

        this.telefon=telefon;
        this.mail=mail;
        this.elev=elev;
        this.departament= departament;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Elev getElev()
    {
        return elev;
    }
    public void setElev(Elev elev)
    {
        this.elev=elev;
    }


    public String afis_student()
    {
        Threads t1 = new Threads("Thread-afisare");
        t1.start();

        return "------------------------||-------------------------" + "\n                     STUDENT: \n"+
                "id: "+ id+
                elev.afis()   + "\nTelefon: " +telefon + ", Email: "+ mail;
    }



}

