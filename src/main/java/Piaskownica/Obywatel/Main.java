package Piaskownica.Obywatel;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        RejestrObywateli rejestrObywateli = new RejestrObywateli();

        rejestrObywateli.dodajObywatela("1234", "Marek", "Zegarek");
        rejestrObywateli.dodajObywatela("456", "Darek", "Barek");
        rejestrObywateli.dodajObywatela("789", "Arek", "Tokarek");
        rejestrObywateli.dodajObywatela("123", "Barek", "Cwaniarek");

//        rejestrObywateli.drukjMape();
        rejestrObywateli.drukujMapeWARTOSCI();
        rejestrObywateli.drukujMpeKUCZE();
        rejestrObywateli.urodzonyPrzed(500);

       // rejestrObywateli.drukujKlucze();

//        rejestrObywateli.drukujWartosci();
//        System.out.println(rejestrObywateli.poNazwisku("Arek"));
//        rejestrObywateli.zjandzObywatelaPoNazwisku("Barek");

        //Wydobywanie rocznika z nru pesel (ale tylko 10 cyf :(  )
        int a = 1234567891;
        int b = a-a%100000000;
        System.out.println(b);
        int rocznik = b/100000000;
        System.out.println(rocznik);

    }
}
