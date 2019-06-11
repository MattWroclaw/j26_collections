package Piaskownica.Student2zadania;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Student {
    private long numerIndexu;
    private String imie, nazwisko;

//    @Override
//    public String toString() {
//        return "Student{" +
//                "numerIndexu=" + numerIndexu +
//                ", imie='" + imie + '\'' +
//                ", nazwisko='" + nazwisko + '\'' +
//                '}';
//    }

    public Student( String imie, String nazwisko) {
        this.numerIndexu = numerIndexu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Student(long numerIndexu, String imie, String nazwisko){
        this.numerIndexu = numerIndexu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public long getNumerIndexu() {
        return numerIndexu;
    }



    public void setNumerIndexu(long numerIndexu){
        this.numerIndexu=numerIndexu;

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
