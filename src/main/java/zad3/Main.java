package zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("123", "Ania", "Gawel", Gender.KOBIETA));
        studentList.add(new Student("186", "Arek", "TEawae", Gender.MEZCZYZNA));
        studentList.add(new Student("147", "Ela", "Geas", Gender.KOBIETA));
        studentList.add(new Student("987", "Marek", "Opawe", Gender.MEZCZYZNA));
        studentList.add(new Student("547", "Basia", "Placek", Gender.KOBIETA));
        studentList.add(new Student("787", "Darek", "TEawae", Gender.MEZCZYZNA));

        //wypisanie wszystkiech !!  ma byc  metoda toString w klasie Student!)
//        System.out.println(studentList);

        // wypisanie pierwszego obiektu
//        System.out.println(studentList.get(0));

        for (Student element : studentList){
            System.out.println(element);
        }
        System.out.println();
        // wypisz kobiety
        for (Student element : studentList){
            if (element.getPlec()==Gender.KOBIETA){
                System.out.println(element);
            }
        }


        //numery indexu
        for (Student  element : studentList){
            System.out.println(element.getNrIndexu());
        }
    }
}
