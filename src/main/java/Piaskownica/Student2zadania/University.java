package Piaskownica.Student2zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class University {

    Map<Long, Student> mpSt = new HashMap<>();

    public void dodajStudenta(Student student) {
        Random generator = new Random();
        student.setNumerIndexu(generator.nextInt(999));
        mpSt.put(student.getNumerIndexu(), student);
    }

    public void dodStudZnrIndex(Student student) {
        mpSt.put(student.getNumerIndexu(), student);
    }

    public void wypiszSt() {
        System.out.println(mpSt);
    }

    boolean containsStudent(long nrIndexu) {
        return
                mpSt.containsKey(nrIndexu);
    }

    Student getStudent(long nrIndeu) throws NieMaTutakiegoException {
        if (mpSt.containsKey(nrIndeu)) {
            return mpSt.get(nrIndeu);
        }throw new NieMaTutakiegoException("Kazik??? Nie ma tu takiego... Nie ma i już!");

    }

    Optional<Student> getStudentOptional(long nrIndexu){
        if (mpSt.containsKey(nrIndexu)){
            return Optional.ofNullable(mpSt.get(nrIndexu));
        } return Optional.empty();

    }

    int studentCount() {
        return mpSt.size();
    }

}
