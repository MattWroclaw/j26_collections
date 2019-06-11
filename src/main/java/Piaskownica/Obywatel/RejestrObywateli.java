package Piaskownica.Obywatel;

import javax.print.DocFlavor;
import java.util.*;

public class RejestrObywateli {
    private Map<String, Obywtel> rejestr = new HashMap<>();

    void dodajObywatela(String pesel, String imie, String nazwisko){
        Obywtel obywtel = new Obywtel(pesel, imie, nazwisko);
        rejestr.put(obywtel.getPesel(), obywtel);
    }

    Obywtel znajdzObywatelaPoPeselu(String pesel){
        return rejestr.get(pesel);
    }


   boolean poNazwisku(String nazwisko){
        return rejestr.containsValue(nazwisko);
   }

    void drukuj(){
        System.out.println(rejestr);
    }

    void drukjMape(){
        System.out.println("Cala mapa");
        for(Map.Entry<String, Obywtel> obywtelEntry : rejestr.entrySet()){
           final String pesel = obywtelEntry.getKey();
           Obywtel pozostaleDane = obywtelEntry.getValue();
            System.out.println("pesel: "+pesel+" dane: "+pozostaleDane);
        }
    }

    void drukujMapeWARTOSCI(){
        System.out.println("Map.Entry = vartosci");
        for(Map.Entry<String, Obywtel> obywtelEntry : rejestr.entrySet()){
            Obywtel wartosci = obywtelEntry.getValue();
            System.out.println("Wartość: "+ wartosci);
        }
    }

    void drukujMpeKUCZE(){
        System.out.println("Map.Entry = klucze");
        for (Map.Entry<String, Obywtel> dane : rejestr.entrySet()){
            String peseleKlucze = dane.getKey();
            System.out.println("Klucze,pesele: "+peseleKlucze);
        }
    }

    void drukujWartosci(){
        System.out.println("Same wartosci");
        Set<Obywtel> daneObywatela = new HashSet<>(rejestr.values());
        for (Obywtel dane : daneObywatela){
            System.out.println(dane);
        }
    }
    void drukujKlucze(){
        System.out.println("same klucz - pesele");
        Set<String > klucze = new HashSet<>(rejestr.keySet());
        for (String klucz : klucze){
            System.out.println(klucz);
        }
    }

    void urodzonyPrzed(int rok){
        for(Map.Entry<String, Obywtel>  elementy : rejestr.entrySet() ){
            Obywtel dane = elementy.getValue();
            String pesel = elementy.getKey();

            int peselCyfra =Integer.parseInt(pesel);
            int pomocnicza = peselCyfra - peselCyfra%10000000;
            int rocznik = pomocnicza/100000000;

            if(rocznik<rok){
                System.out.println("pesel: "+pesel+" dane: "+dane);
            }
        }
    }

    void znajdzObImienia(String imie){

    }


}
