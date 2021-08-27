package DevDojo.Y_Coleções.Listas_Compareble_Comparator;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();

        nomes.add("Felipe");
        nomes.add("DeveDojo Academy");
        nomes.remove(0);

        for (String nome : nomes) {
            System.out.println(nome.matches("Felipe"));
        }

        nomes.add("Suane");

        System.out.println("----------------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("----------------------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

        System.out.println("----------------------------");

        List<String> nomes2 = new ArrayList();
        nomes2.add("Suane");
        nomes2.add("Academy");
        nomes.addAll(nomes2);

        System.out.println(nomes);
    }
}
