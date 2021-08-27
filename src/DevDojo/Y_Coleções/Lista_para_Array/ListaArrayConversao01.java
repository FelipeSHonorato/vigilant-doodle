package DevDojo.Y_Coleções.Lista_para_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Convertendo List em Array
        Integer[] listToArray = numeros.toArray(new Integer[0]);

        //Imprimindo o Array convertido
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];

        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        System.out.println(Arrays.toString(numerosArray));

        System.out.println("-------------------------------");

        //Converte de Array para List porem cria um espelho, onde qualquer alteração afeta a Array tb
        List<Integer> arrayToList = Arrays.asList(numerosArray);

        System.out.println(arrayToList);

        System.out.println("-------------------------------");

        //Convertendo sem dependência de Array para List
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

        numerosList.add(15);

        System.out.println(numerosList);

        //Meios de criar ArrayList declarando de início
        List<Integer> numeros2 = Arrays.asList(1,2,3,4,5);

        List.of(1,2,3,4,5);

    }
}
