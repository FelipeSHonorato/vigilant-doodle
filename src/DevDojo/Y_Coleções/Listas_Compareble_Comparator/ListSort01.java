package DevDojo.Y_Coleções.Listas_Compareble_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Dragon Ball Z");
        mangas.add("Pokemon");

        // Reorganiza a lista ordem alfabética
        Collections.sort(mangas);

        for (String manga: mangas){
            System.out.println(manga);
        }

        System.out.println("---------------------------");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);



    }
}
