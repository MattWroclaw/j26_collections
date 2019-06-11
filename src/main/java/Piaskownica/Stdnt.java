package Piaskownica;

import java.util.ArrayList;
import java.util.List;

public class Stdnt {

    private String nrInd, imie, nazwisko;
    private double ocena;

    public   List<Double> osceny = new ArrayList<>();

    @Override
    public String toString() {
        return "Stdnt{" +
                "nrInd='" + nrInd + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", ocena=" + ocena +
                ", osceny=" + osceny +
                '}';
    }

    public String getNrInd() {
        return nrInd;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public Stdnt(String nrInd, String imie, String nazwisko) {
        this.nrInd = nrInd;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public double getOcena() {
        return ocena;
    }

    public List<Double> getOsceny() {
        return osceny;
    }


}
