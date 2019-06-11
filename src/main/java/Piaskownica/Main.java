package Piaskownica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dznnnk dznnnk = new Dznnnk();

        Stdnt stdnt1 = new Stdnt("123", "JOas", "Onsda");
        Stdnt stdnt2 = new Stdnt("234", "Poads", "Jkh");
        Stdnt stdnt3 = new Stdnt("321", "NJk", "Ase");
        Stdnt stdnt4 = new Stdnt("432", "IU", "Vds");

        dznnnk.dodajStudenta(stdnt1);
        dznnnk.dodajStudenta(stdnt2);
        dznnnk.dodajStudenta(stdnt3);
        dznnnk.dodajStudenta(stdnt4);



    }
}
