package Piaskownica.Student2zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)  {

        University university = new University();

        university.dodajStudenta(new Student("Bole", "Lolek"));
        university.dodajStudenta(new Student("Ania", "Bania"));

        university.dodStudZnrIndex(new Student(884422, "Zosia", "Samosia"));
        university.dodStudZnrIndex(new Student(101010, "Basia", "Ptasia"));
        university.wypiszSt();

        //dlaczego tutaj jest false?
        System.out.println("mpSt.caontains key: "+university.mpSt.containsKey(884422));

        // ... a tutaj true?!
        System.out.println("unversityContainStudent:"+university.containsStudent(884422));

        //optional
        Optional<Student> u = university.getStudentOptional(88422);
        if (u.isPresent()){
            System.out.println("optional "+university.getStudent(884422));
        }

        //ile studentów na liście
        System.out.println("Liczba studentów: "+university.studentCount());

        //dawaj studenta o zadanym numerze indexu --> nie ma
     //   System.out.println("Student o zadanym numerze to: "+university.getStudent(1010));


    }

}
