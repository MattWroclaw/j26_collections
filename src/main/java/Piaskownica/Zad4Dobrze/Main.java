package Piaskownica.Zad4Dobrze;

import java.util.Optional;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {
        Journal journal = new Journal();
        Student st = new Student("Tom", "Dom", "123456");
        journal.dodajStudenta(new Student("Tomek", "Domek", "123"));
        journal.dodajStudenta(new Student("Franek", "Kot", "321"));
        journal.dodajStudenta(new Student("Staszek", "Cien", "456"));
        journal.dodajStudenta(new Student("Bolek", "Smyk", "654"));
        journal.dodajStudenta(new Student("Lolek", "Leszcz", "789"));


        journal.zwrocStudenta1("321");
        journal.zwrocPosortowanaListeStudentow();
        journal.usunStudenta("654");


        Optional<Student> s = journal.zwrocStudenta1("123");
        if (s.isPresent()) {
            Student wypakowany = s.get();
            System.out.println(wypakowany);
        }

        Student student = journal.zwrocStudenta2_zle("123");
        if (student != null) {
            System.out.println(student.getImie());
        }

        try {
            Student student_2 = journal.zwrocStudenta2("123");
            // jeśli kod dotarł w to miejsce, to znaczy że student
            // istnieje

            System.out.println(student_2);
        } catch (StudentNotFoundException e) {
            System.out.println("Błąd, nie znaleziono studenta");
        }





    }
}
