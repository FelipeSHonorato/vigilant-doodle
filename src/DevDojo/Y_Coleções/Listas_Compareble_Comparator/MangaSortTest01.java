package DevDojo.Y_Coleções.Listas_Compareble_Comparator;

import DevDojo.Y_Coleções.Equals_HashCode.domínio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}


public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5l,"Attack on Titan",19.9));
        mangas.add(new Manga(1l,"Berserk", 9.5));
        mangas.add(new Manga(4l,"Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3l,"Dragon Ball Z", 11.20));
        mangas.add(new Manga(2l,"Pokemon", 2.99));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------------");

        //Utilizando Comparable da classe Manga

        Collections.sort(mangas); //Ordenar por preço

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------------");

        //Utilizando Comparator - Vizualizar topo, classe MangaByIdComparator

        mangas.sort(new MangaByIdComparator()); //Ordenar por id

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

    }
}
