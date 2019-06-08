package Zad4;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String indeks, imie, nazwisko;
    private double ocena;

    private List<Double> listaOcen = new ArrayList<Double>();

    public double getOcena() {
        return ocena;
    }

    public Student(String indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }



}
