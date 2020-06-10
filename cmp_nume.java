package proiect;

import java.util.Comparator;

public class cmp_nume implements Comparator {
    @Override

    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        return s1.elev.nume.getNume().compareTo(s2.elev.nume.getNume());

    }
}
