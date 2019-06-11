package Piaskownica.Zad4Dobrze;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String imie, nazwisko, indeks;
    private List<Double> listaOcen = new ArrayList<>();

    public Student(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks='" + indeks + '\'' +
                ", listaOcen=" + listaOcen +
                '}';
    }
}

