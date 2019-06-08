package zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("POdaj ile liczb wpisujesz");
        int iloscObiegowPetliScannera = input.nextInt();

        System.out.println("POdaj ile chcesz wylosowac");
        int iloscObiegowPetliRandom = input.nextInt();


        Random generator = new Random();

        List<Integer> lista = new ArrayList<Integer>();



        while ((iloscObiegowPetliScannera --) >0){
            System.out.println("podaj liczbe");
            int liczbaZaladowane= input.nextInt();
            lista.add(liczbaZaladowane);
        }

        while ((iloscObiegowPetliRandom --) >0){
            int liczbaZaladowane= generator.nextInt(1000);
            lista.add(liczbaZaladowane);
        }
        System.out.println(lista);

        //sumowanie
        double suma = 0;
        for (Integer elementLity : lista){
            suma +=elementLity;
        }
        System.out.println("Suma "+ suma);
        System.out.println("Srednia " +(suma/lista.size()));

    }



}
