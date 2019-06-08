package zad3;

public class Student  {
    private String indeks, imie, nazwisko;

    private Gender plec;

    @Override
    public String toString() { //Alt Insert i toString
        return "Student{" +
                "indeks='" + indeks + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
    }

    public Student(String indeks, String imie, String nazwisko, Gender plec) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;

    }

    public Gender getPlec() {
        return plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNrIndexu() {
        return indeks;

    }

}
