package DevDojo.Y_Coleções.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        //Primeiro precisa ordenar a lista
        Collections.sort(numeros);

        //Informa qual a posição onde deveria ser inserida o número informado
        System.out.println(Collections.binarySearch(numeros,2));

    }
}
