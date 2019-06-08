package zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaA = new ArrayList<Integer>();
        Random generator = new Random();

        for (int i = 0; i<10 ; i++){
            listaA.add(generator.nextInt(100));
        }

        int suma=0;
        for (Integer elementy : listaA){
            suma += elementy;
        }

        // kopiowanie elementów listy A do listy B
        List<Integer> listaB = new ArrayList<Integer>(listaA);
        //  listaB.addAll(listaA); // alternatywa dla kopiowania ele z listy A do listy B

        System.out.println("Suma "+ suma);
        System.out.println("Srednia: "+ suma/listaA.size());

        System.out.println();
        Collections.sort(listaB);
        System.out.println(listaB);
        //srodkowy element get([list.size()/2 ]) nieparz
        // srodkowy element jak jest parzyste list.so


        if (listaB.size() %2 ==0){// parzysta
            int indeksLewySrodkowy = (listaB.size()/2)-1;
            int indeksPrawySrodkowy = (listaB.size()/2);

            double mediana = (listaB.get(indeksLewySrodkowy)+listaB.get(indeksPrawySrodkowy))/2.0;
            System.out.println("Mediana " + mediana);

        }else {
            int indeksSrodkowy = (listaB.size()/2);
            int mediana = listaB.get(indeksSrodkowy);

            System.out.println("Mediana: "+mediana);
        }


        int min=listaA.get(0);
        int max=listaA.get(0);
        for (Integer elementListy :listaA){
            if(min >elementListy){
                min = elementListy;
            }
            if (max<elementListy){
                max=elementListy;
            }
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);


        // znajdowanie indeksu maksymalnego elementu i minimalnego elementu
        int indexMax = 0;
        int indexMin = 0;

        for (int i =0 ; i< listaA.size();i++){
            if (max==listaA.get(i)){
                indexMax=i;
            }
            if (min == listaA.get(i)){
                indexMin = i;
            }
        }

        System.out.println("Index max: "+indexMax);
        System.out.println("Index min: "+ indexMin);

        //znajdowanie indekow max elementu i minimal
        System.out.println("Index max (indexof): "+ listaA.lastIndexOf(max));
        System.out.println("Index min (indexof): "+ listaA.lastIndexOf(min));
    }


}
