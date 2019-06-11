package Piaskownica;

import java.util.*;

public class Piaskownica {

    public static void main(String[] args) {


        List<Integer> listaIntow = new ArrayList<>();
        Random generator = new Random();
        int suma =0;

        for (int i = 0; i<10; i++){
            int losowa = generator.nextInt(8);
            listaIntow.add(losowa);
        }


        for (Integer elementy: listaIntow){
            suma = suma+elementy;
        }


        System.out.println("suma: "+suma);
        System.out.println("średnia: "+ suma/listaIntow.size());


        //kopiowanie elementow listy

        List<Integer> kopia = new ArrayList<>(listaIntow);


        List<Integer> kopiaKopi = new ArrayList<>();

        Collections.sort(kopia);
        System.out.println("kopia posortowana"+kopia);

        //mediana 1. Parz (n+1)/ 2.Nparz

        if (kopia.size() %2 ==0){
            int srodkowyIndex = (kopia.size()+1)/2;
            int mediana = kopia.get(srodkowyIndex);
            System.out.println("Mediana parzysta"+mediana);
        }if (kopia.size() %2 ==0){
            int srodkowyINdex = (kopia.size()/2);
            int mediana = kopia.get(srodkowyINdex);
            System.out.println("Mediana nieparzysta"+mediana);
        }

        //szukanie max i min
        int max=listaIntow.get(0);
        int min=listaIntow.get(0);
        for (int element : listaIntow){
        if (element>max){
            max = element;
        }
        if (element<min){
            min=element;
        }

        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);

        int szukanyIndexMax = 0;
        int szukanyIndenMin = 0;

        for (int i = 0; i<listaIntow.size();i++){
            if(max ==listaIntow.get(i)){
                szukanyIndexMax=i;
            }
            if (min == listaIntow.get(i)){
                szukanyIndenMin=i;
            }

        }
        System.out.println(listaIntow);
        System.out.println("index max : "+ szukanyIndexMax);
        System.out.println("index min :"+szukanyIndenMin);

        System.out.println("index max met. lastIndexOf: "+ listaIntow.lastIndexOf(max));
        System.out.println("index min metodą lastIndexOf: "+ listaIntow.lastIndexOf(min));
        System.out.println(listaIntow.lastIndexOf(4));
    }
}