package zad1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int twojaLista = input.nextInt();

        Random generator = new Random();


        List<Integer> lista = new ArrayList<Integer>();

        for (int i=0; i<5; i++){
           int liczbaZaladowane= input.nextInt();
           lista.add(liczbaZaladowane);
        }

        for (int i=0; i<5; i++){
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
